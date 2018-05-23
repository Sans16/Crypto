package com.example.ssanusi.crypto;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ArrayList<Money> money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

                Api api = retrofit.create(Api.class);

            Call<MoneyResponse> call = api.getMoney();
            call.enqueue(new Callback<MoneyResponse>() {
             @Override
             public void onResponse(Call<MoneyResponse> call, Response<MoneyResponse> response) {

                 money = response.body().getData();

                Log.d("gdfdgd",response.body().getData().get(0).getId());
             }

             @Override
             public void onFailure(Call<MoneyResponse> call, Throwable t) {
                 Toast.makeText(getApplicationContext(),
                         t.getMessage(),Toast.LENGTH_SHORT).show();
             }
         });



    }
}
