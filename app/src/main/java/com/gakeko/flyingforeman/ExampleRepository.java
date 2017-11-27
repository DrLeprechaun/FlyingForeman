package com.gakeko.flyingforeman;

import io.reactivex.Flowable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Leprechaun on 24.11.2017.
 */

public interface ExampleRepository {

    @POST("hello-convert-and-send")
    Flowable<Void> sendRestEcho(@Query("msg") String message);
}
