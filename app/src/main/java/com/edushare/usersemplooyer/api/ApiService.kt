package com.edushare.usersemplooyer.api


import com.edushare.usersemplooyer.models.EmployeeResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService{

    @GET("employees")
    suspend fun getEmployees():Response<EmployeeResponse>


}