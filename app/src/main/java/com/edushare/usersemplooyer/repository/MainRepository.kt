package com.edushare.usersemplooyer.repository

import com.edushare.usersemplooyer.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(

           private val apiHelper: ApiHelper
 ) {
    suspend fun getEmployee() =apiHelper.getEmployees()
}