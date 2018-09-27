package com.gangoogle.baseproject.api;


import com.gangoogle.baseproject.bean.MovieResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zgyi on 2018/9/25.
 */
public interface ApiServer {

    @GET("regeo")
    Observable<MovieResponse> getUser(@Query("longitude") String longitude, @Query("latitude") String latitude);
}
