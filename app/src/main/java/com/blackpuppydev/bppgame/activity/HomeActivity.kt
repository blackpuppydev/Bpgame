package com.blackpuppydev.bppgame.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.adapter.GameAdapter
import com.blackpuppydev.bppgame.api.Api
import com.blackpuppydev.bppgame.api.GameApi
import com.blackpuppydev.bppgame.constance.Tag
import kotlinx.android.synthetic.main.activity_home.*
import retrofit2.Call
import retrofit2.Response

class HomeActivity : BaseActivity(),View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setAdapter()
        setPager()
        getUserAccount()







    }


    override fun onClick(p0: View?) {
        var id = p0?.id

        when{

        }

    }


    private fun setAdapter(){

        val categoryPic = getAllCategoryPic()
        val categoryName = getAllCategoryName()


        val gameAdapter = GameAdapter(categoryPic,categoryName,applicationContext){
            Log.d(Tag.home , it.toString())
            startActivity(Intent(this,GameActivity::class.java).putExtra("type",it))
        }
        adapter_game.layoutManager = LinearLayoutManager(this);
        adapter_game.adapter = gameAdapter

    }


    private fun setPager(){

    }


    private fun getUserAccount(){



        Api.getRetrofit().create(GameApi::class.java).getUser().enqueue(object : retrofit2.Callback<GameApi.User>{
            override fun onResponse(call: Call<GameApi.User>?, response: Response<GameApi.User>?) {
                Log.d("getUserAccount","User : " + response?.body()?.name)
            }

            override fun onFailure(call: Call<GameApi.User>?, t: Throwable?) {
                Log.d("getUserAccount","onFailure " + call.toString() + " " + t?.message)
            }

        })
    }



}