package com.example.appamnhac.Service;

public class APIService {
    private static String base_url = "https://musicmobieapp.000webhostapp.com/Server/";

    public static Dataservice getService ()
    {
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
