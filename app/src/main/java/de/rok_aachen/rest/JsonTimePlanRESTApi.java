package de.rok_aachen.rest;

import java.util.List;

import de.rok_aachen.rest.json.Root;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonTimePlanRESTApi {

    @GET("wp-json/wp/v2/pages?include=27")
    Call<List<Root>> getPosts();
}
