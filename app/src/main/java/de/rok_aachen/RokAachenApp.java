package de.rok_aachen;

import android.app.Application;

import de.rok_aachen.rest.JsonTimePlanRESTApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RokAachenApp extends Application {
    private JsonTimePlanRESTApi restApiService = null;

    @Override
    public void onCreate() {
        super.onCreate();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://rok-aachen.de/")
                .build();

        restApiService = retrofit.create(JsonTimePlanRESTApi.class);
    }

    public JsonTimePlanRESTApi getRestApiService() {
        return restApiService;
    }

    public void setRestApiService(JsonTimePlanRESTApi restApiService) {
        this.restApiService = restApiService;
    }
}
