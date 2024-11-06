package com.example.consumercatfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factApi = RetrofitHelper.getInstance().create(FactApi::class.java)
        // iniciando uma nova coroutine
        MainScope().launch{
            val result = factApi.getFacts()
            if(result != null)
                Log.d("Retorno da API: ", result.body().toString())
        }
    }
}