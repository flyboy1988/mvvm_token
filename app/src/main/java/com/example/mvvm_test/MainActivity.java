package com.example.mvvm_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvvm_test.config.AppController;
import com.example.mvvm_test.model.AppModel;
import com.example.mvvm_test.model.DevInfoModel;
import com.example.mvvm_test.model.DevModel;
import com.example.mvvm_test.model.DevResponseModel;
import com.example.mvvm_test.network.retrofit.ApiResponse;
import com.example.mvvm_test.viewmodel.MainActivityViewModel;
import com.example.mvvm_test.viewmodel.ViewModelFactory;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import static com.example.mvvm_test.network.retrofit.Status.LOADING;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    ViewModelFactory viewModelFactory;
    MainActivityViewModel viewModel;

    //private ArrayList<Article> articleArrayList = new ArrayList<>();
TextView tv;
Button btnGetToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initialization();



        findViewById(R.id.btn_token).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DevInfoModel devInfoModel=new DevInfoModel(1);
                AppModel appModel=new AppModel("android");

           //     DevModel devModel=new DevModel(appModel,devInfoModel);
                viewModel.hitGetTokenApi(appModel, devInfoModel);

            }
        });
    }

    private void initialization() {

        tv=findViewById(R.id.txt_token);
        ((AppController) getApplication()).getAppComponent().injectMainActivity(MainActivity.this);

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityViewModel.class);
        viewModel.loginResponse().observe(this, this::consumeResponse);
    }


    private void getDevToken() {





    }
    private void consumeResponse(ApiResponse apiResponse) {
        switch (apiResponse.status) {
            case LOADING:
                Toast.makeText(MainActivity.this,"loading",Toast.LENGTH_SHORT).show();

                break;
            case SUCCESS:

                renderSuccessResponse(apiResponse.data);

                break;
            case ERROR:
                Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();

                break;
            default:
                break;
        }
    }
    private void renderSuccessResponse(JsonElement response) {
        if (!response.isJsonNull()) {
            Gson gson = new Gson();
            response.getAsJsonObject();

                    DevResponseModel devResponseModel = gson.fromJson(response, DevResponseModel.class);
                    if (devResponseModel != null) {
                        if(devResponseModel.getToken()!=null && !devResponseModel.getToken().equals(null )){
                     tv.setText(devResponseModel.getToken());


                        }
                    }


        }
    }

}
