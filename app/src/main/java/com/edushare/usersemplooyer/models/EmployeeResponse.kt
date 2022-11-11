package com.edushare.usersemplooyer.models

data class EmployeeResponse(
    val data: List<Employee>?=null,
    val status: String?=""
)