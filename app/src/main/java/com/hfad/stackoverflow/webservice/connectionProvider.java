package com.hfad.stackoverflow.webservice;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by amir ali on 8/22/2017.
 */

public class connectionProvider {
    private connectionService mTService ;
    public static final String BASE_URL="http://api.stackexchange.com/2.2/";

    public connectionProvider() {

        final OkHttpClient httpClient = new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
        mTService = retrofit.create(connectionService.class);
    }

    public connectionService getTService(){
        return mTService;
    }
}
