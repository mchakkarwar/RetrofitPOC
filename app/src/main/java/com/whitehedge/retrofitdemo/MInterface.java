package com.whitehedge.retrofitdemo;

import android.os.Handler;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Mahesh Chakkarwar on 07-07-2016.
 */
public interface MInterface {
    @GET("/users/mobilesiri")
    void getUser(Callback<Model1> uscb);
}
