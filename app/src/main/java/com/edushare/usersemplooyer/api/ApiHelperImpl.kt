package com.edushare.usersemplooyer.api

import com.edushare.usersemplooyer.models.EmployeeResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(
    private val apiSevice:ApiService

):ApiHelper{
    override suspend fun getEmployees():Response<EmployeeResponse>  = apiSevice.getEmployees()
}