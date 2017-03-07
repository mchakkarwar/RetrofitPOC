package com.whitehedge.retrofitdemo;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    String url = "https://api.github.com";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.id_txt_main_layout);
        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("fetching data");
        progressDialog.show();
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(url).build();
        MInterface restInterface = restAdapter.create(MInterface.class);
        restInterface.getUser(new Callback<Model1>() {
            @Override
            public void success(Model1 model1, Response response) {
                textView.setText(model1.toString());
                progressDialog.dismiss();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this,"Fetching error",Toast.LENGTH_SHORT);
               progressDialog.dismiss();
            }
        });
    }
}
