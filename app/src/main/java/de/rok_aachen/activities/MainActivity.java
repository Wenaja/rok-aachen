package de.rok_aachen.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import de.rok_aachen.R;
import de.rok_aachen.RokAachenApp;
import de.rok_aachen.rest.JsonTimePlanRESTApi;
import de.rok_aachen.rest.json.Root;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "LOG";
    private Button btn_checkIt = null;
    private TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_checkIt = findViewById(R.id.btn_check_activity);
        textView = findViewById(R.id.txtView_Content);

        RokAachenApp rokAachenApp = (RokAachenApp) getApplication();
        JsonTimePlanRESTApi jsonTimePlanRESTApi = rokAachenApp.getRestApiService();
        Call<List<Root>> calls = jsonTimePlanRESTApi.getPosts();

        calls.enqueue(new Callback<List<Root>>() {
            @Override
            public void onResponse(Call<List<Root>> call, Response<List<Root>> response) {
                if(!response.isSuccessful()){
                    String message = "On Responce error with code " + response.code();
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

                    return;
                }

                List<Root> roots = response.body();

                String content = "noch leer";

                for(Root root : roots){
                    content = root.getContent().getRendered();
                    content += " \nfor besucht!";
                }

                textView.setText(content);
            }

            @Override
            public void onFailure(Call<List<Root>> call, Throwable t) {
                Log.d(TAG, t.getMessage());
            }
        });

    }

    public void onClick(View v){
        Intent intent = new Intent(this, WorshipTimetableActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}