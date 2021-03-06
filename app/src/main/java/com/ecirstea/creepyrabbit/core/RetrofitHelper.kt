package com.ecirstea.creepyrabbit.core

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitHelper {


         val BASEURL = "http://10.0.2.2:9100/"
         val BASEURLMULTIMEDIA = "http://10.0.2.2:9801/"
        private var retrofit:Retrofit?=null

        fun getApiClientForUsers(): Retrofit {
            val gson = GsonBuilder()
                .setLenient()
                .create()
            val okHttpClient = OkHttpClient.Builder()
                .readTimeout(100, TimeUnit.SECONDS)
                .connectTimeout(100, TimeUnit.SECONDS)
                .build()
            if (retrofit == null) {

                retrofit = Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit!!
        }
    fun getApiClientForMultimedia(): Retrofit {
        val gson = GsonBuilder()
            .setLenient()
            .create()
        val okHttpClient = OkHttpClient.Builder()
            .readTimeout(100, TimeUnit.SECONDS)
            .connectTimeout(100, TimeUnit.SECONDS)
            .build()
        if (retrofit == null) {

            retrofit = Retrofit.Builder()
                .baseUrl(BASEURL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }
        return retrofit!!
    }
    }

    /*fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("10.0.2.2:9100/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    } */
