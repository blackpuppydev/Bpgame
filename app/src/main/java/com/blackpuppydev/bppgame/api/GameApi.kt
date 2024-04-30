package com.blackpuppydev.bppgame.api

import com.google.gson.annotations.SerializedName
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface GameApi {

    @GET("/api/user")
    fun getUser():Call<User>







    class User {

        @SerializedName("id")
        var id:Int = 0;

        @SerializedName("name")
        var name:String? = null

        @SerializedName("lastName")
        var lastName:String? = null

//        @SerializedName("create_at")
//        var createAt:Date? = null


    }
}