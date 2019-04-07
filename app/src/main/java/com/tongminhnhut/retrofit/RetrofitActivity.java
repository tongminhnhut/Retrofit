package com.tongminhnhut.retrofit;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {

    private String username ;
    private String password ;
    RestClient client ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        callAPI(username, password);
    }

    private void callAPI(String username, String password) {
        APIClient  api = client.restClient.create(APIClient.class);
        Call<DataRespone> callAPI = api.login(username,password);
        callAPI.enqueue(new Callback<DataRespone>() {
            @Override
            public void onResponse(Call<DataRespone> call, Response<DataRespone> response) {
                if (response.isSuccessful()){

                } else  {
                    Log.i("Error", "Response not Success");
                }
            }

            @Override
            public void onFailure(Call<DataRespone> call, Throwable t) {
                t.printStackTrace();
                Log.i("Error", t.toString());
            }
        });
    }
}
