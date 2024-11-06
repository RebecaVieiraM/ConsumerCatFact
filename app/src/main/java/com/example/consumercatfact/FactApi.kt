package com.example.consumercatfact

import retrofit2.Response
import retrofit2.http.GET

interface FactApi {
    @GET("/fact")
    suspend fun getFacts() : Response<Fact>
}