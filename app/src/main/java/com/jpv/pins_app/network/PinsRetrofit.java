package com.jpv.pins_app.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class PinsRetrofit {

    private static final String PINS_BASE_URL = "https://raw.githubusercontent.com/";

    private static Retrofit retrofitInstance;

    public PinsRetrofit() {
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofitInstance == null) {
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(PINS_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }
}
