package com.gangoogle.baseproject.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiRetrofit {
    private static ApiRetrofit mApiRetrofit;
    private OkHttpClient mOkhttpClient;
    private Retrofit mRetrofit;
    private ApiServer mApiServer;


    private ApiRetrofit() {
        //okhttp
        mOkhttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(ApiConfig.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(ApiConfig.READ_TIMEOUT, TimeUnit.SECONDS)
                .build();
        //mRetrofit
        mRetrofit = new Retrofit.Builder()
                .baseUrl(ApiConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mOkhttpClient)
                .build();
        //api server
        mApiServer = mRetrofit.create(ApiServer.class);

    }

    private Interceptor interceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            long startTime = System.currentTimeMillis();
            Response response = chain.proceed(chain.request());
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            MediaType mediaType = response.body().contentType();
            String content = response.body().string();
            String startStr = "----------Request Start----------------\n";
            String requestStr = request.toString() + request.headers().toString() + "\n";
            String responseStr = "Response:" + content + "\n";
            String endStr = "----------Request End:" + duration + "毫秒----------\n";
            Logger.i(startStr + requestStr + responseStr + endStr);
            return response.newBuilder()
                    .body(ResponseBody.create(mediaType, content))
                    .build();
        }
    };

    public static ApiRetrofit getIntance() {
        if (mApiRetrofit == null) {
            synchronized (ApiRetrofit.class) {
                if (mApiRetrofit == null) {
                    mApiRetrofit = new ApiRetrofit();
                }
            }
        }
        return mApiRetrofit;
    }

    public ApiServer getmApiServer() {
        return mApiServer;
    }
}
