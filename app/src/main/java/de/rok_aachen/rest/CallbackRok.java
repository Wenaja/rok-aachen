package de.rok_aachen.rest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.rest.json.Root;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallbackRok implements Callback<List<Root>> {
    private final String LOG = "LOG";
    private final String VAR = "VAR";

    private String rendered = null;
    private Context context = null;
    private List<Root> roots = null;

    public CallbackRok(Context context){
        this.context = context;
    }

    @Override
    public void onResponse(Call<List<Root>> call, Response<List<Root>> response) {
        if (!response.isSuccessful()){
            Toast.makeText(context, "Response not successful", Toast.LENGTH_LONG).show();
            Log.d(VAR, "Callback.onResponse :: Response code " + response.code());
            return;
        }

        roots = response.body();

        rendered = new String();

        for (Root root: roots) {
            rendered += root.getContent().getRendered();
        }
        Log.d(VAR, "Callback.onResponse :: response is successful");
    }

    @Override
    public void onFailure(Call<List<Root>> call, Throwable t) {
        Toast.makeText(context, "Call rok fail", Toast.LENGTH_LONG).show();
        Log.d(VAR, "(Callback onFailure) FAIL Message: " + t.getMessage());
    }

    public List<Root> getResponseBody(){
        if (roots == null){
            roots = new ArrayList<>();
        }

        return roots;
    }
}
