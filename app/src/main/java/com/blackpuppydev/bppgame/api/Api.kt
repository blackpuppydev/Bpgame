package com.blackpuppydev.bppgame.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {

    companion object{
        //172.18.2.110

        fun getRetrofit() : Retrofit{
            val builder: Retrofit.Builder = Retrofit.Builder()
                .baseUrl("http://172.18.2.110:8080")
                .addConverterFactory(GsonConverterFactory.create())
//            .client(getOkHttpClient())
            return builder.build()
        }


        fun getOkHttpClient(): OkHttpClient? {
            return null
        }


    }




}