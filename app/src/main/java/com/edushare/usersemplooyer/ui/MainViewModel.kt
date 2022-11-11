package com.edushare.usersemplooyer.ui


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.activity.viewModels
import com.edushare.usersemplooyer.models.EmployeeResponse
import com.edushare.usersemplooyer.other.Resource
import com.edushare.usersemplooyer.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
):ViewModel(){
    private val _res=MutableLiveData<Resource<EmployeeResponse>>()

    val res : LiveData<Resource<EmployeeResponse>>
    get()=_res


    init {
        getEmployees()
    }

    private fun getEmployees() = viewModelScope.launch {
        _res.postValue(Resource.loading(null))
        mainRepository.getEmployee().let {
            if(it.isSuccessful){
                _res.postValue(Resource.success(it.body()))
            }else{
                _res.postValue(Resource.error(it.errorBody().toString(),null))
            }
        }
    }

}