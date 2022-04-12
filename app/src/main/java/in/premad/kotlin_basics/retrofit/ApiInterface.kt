package `in`.premad.kotlin_basics.retrofit

import `in`.premad.kotlin_basics.model.GetPlansResponse
import `in`.premad.kotlin_basics.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("dummyAPi")
    fun getServices() : Call<ServicesSetterGetter>


    @GET("getPlans")
    fun getPlans(): Call<GetPlansResponse>

}