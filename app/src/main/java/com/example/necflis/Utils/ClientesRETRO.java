package com.example.necflis.Utils;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientesRETRO {

    public static Retrofit getClient(String url){
        Retrofit retrofit= new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        return  retrofit;
    }
}