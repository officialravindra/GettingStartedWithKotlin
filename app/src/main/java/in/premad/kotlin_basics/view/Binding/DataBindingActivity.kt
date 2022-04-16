package `in`.premad.kotlin_basics.view.Binding

import `in`.premad.kotlin_basics.R
import `in`.premad.kotlin_basics.databinding.ActivityDataBindingBinding
import `in`.premad.kotlin_basics.model.UserModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.databinding.DataBindingUtil
//import androidx.databinding.DataBindingUtil.setContentView

class DataBindingActivity : AppCompatActivity() {

    lateinit var binding: ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)
//        binding = setContentView(this@DataBindingActivity, R.layout.activity_main)
//
//
////        var userModel = UserModel()
////        userModel.uName = "OfficialRavindra"
////        userModel.pwd = "Officialravindra"
////        binding.userModel = userModel
////    }
    }
}