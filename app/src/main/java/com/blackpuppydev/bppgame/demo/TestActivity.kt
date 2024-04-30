package com.blackpuppydev.bppgame.demo

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.activity.BaseActivity
import com.blackpuppydev.bppgame.api.Api
import com.blackpuppydev.bppgame.api.GameApi
import okhttp3.Callback
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response


class TestActivity : BaseActivity(),View.OnClickListener {

    private var tag :String = "TestActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        checkRunTimePermission()





    }

    override fun onClick(p0: View?) {

        when (val id = p0?.id){
            R.id.btn_permission -> checkRunTimePermission()
            else -> throw IllegalStateException("Unexpected value: $id")
        }
    }




}