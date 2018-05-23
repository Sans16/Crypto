package com.example.ssanusi.crypto;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api.coinmarketcap.com/v2/";
    @GET("listings")
    Call<MoneyResponse> getMoney();


}
