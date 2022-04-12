package `in`.premad.kotlin_basics.repository

import `in`.premad.kotlin_basics.model.GetPlansDetails
import `in`.premad.kotlin_basics.model.GetPlansResponse
import `in`.premad.kotlin_basics.model.ServicesSetterGetter
import `in`.premad.kotlin_basics.retrofit.RetrofitClient
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainActivityRepository {

    val serviceSetterGetter = MutableLiveData<ServicesSetterGetter>()
    val plansList = MutableLiveData<List<GetPlansDetails>>()

    fun getServicesApiCall(): MutableLiveData<ServicesSetterGetter> {
        Log.v("DEBUG : ", "mainViewRepositoryCalled inside getServicesApiCall")

        val call = RetrofitClient.apiInterface.getServices()

        call.enqueue(object: Callback<ServicesSetterGetter> {
            override fun onFailure(call: Call<ServicesSetterGetter>, t: Throwable) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<ServicesSetterGetter>,
                response: Response<ServicesSetterGetter>
            ) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", response.body().toString())

                val data = response.body()

                val msg = data!!.message
                val status = data!!.status
                val ty = "data!!.message"

                serviceSetterGetter.value = ServicesSetterGetter(status,msg)
            }
        })

        return serviceSetterGetter
    }

    fun getPlansApiCall(): MutableLiveData<List<GetPlansDetails>> {
        Log.v("DEBUG : ", "mainViewRepositoryCalled inside getServicesApiCall")

        val call = RetrofitClient.apiInterface.getPlans()




        call.enqueue(object: Callback<GetPlansResponse> {
            override fun onFailure(call: Call<GetPlansResponse>, t: Throwable) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<GetPlansResponse>,
                response: Response<GetPlansResponse>
            ) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", response.body().toString())

                val data = response.body()

                val msg = data!!.message
                val status = data!!.status
                val planlist = data!!.data



                plansList.value = planlist
            }
        })

        return plansList
    }
}