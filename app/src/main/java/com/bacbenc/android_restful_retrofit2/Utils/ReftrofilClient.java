package com.bacbenc.android_restful_retrofit2.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReftrofilClient {

    public static Retrofit retrofit = null;

    public static Retrofit getRetrofitClient(String url) {
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
