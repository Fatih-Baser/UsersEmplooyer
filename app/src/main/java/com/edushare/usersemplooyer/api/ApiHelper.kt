package com.edushare.usersemplooyer.api


import com.edushare.usersemplooyer.models.EmployeeResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getEmployees():Response<EmployeeResponse>

}

/*
In this package we will create two interfaces namely, ApiService, ApiHelper and a class ApiHelperImpl.
As the name suggests ApiService will service our network call and ApiHelper will help it to be
accessed via repository maintaining encapsulation. ApiHelperImpl will be the class
which will implement ApiHelper to provide functionality to ApiHelper functions.
Also all the functions will be suspended, so that all network calls on background thread instead of main thread.
Let’s see how!

 */