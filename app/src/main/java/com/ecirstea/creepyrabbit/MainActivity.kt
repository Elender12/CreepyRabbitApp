package com.ecirstea.creepyrabbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.ecirstea.ApiClient
import com.ecirstea.api.JwtResponseApi
import com.ecirstea.api.model.JwtRequest
import com.ecirstea.creepyrabbit.data.network.JwtService
import com.ecirstea.creepyrabbit.databinding.ActivityMainBinding
import com.ecirstea.creepyrabbit.ui.view.HomeActivity
import com.ecirstea.creepyrabbit.ui.viewmodel.JwtViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val jwtViewModel: JwtViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        jwtViewModel.jwtModel.observe(this, Observer {
            if(it?.token != null){
                val intent = Intent(this, HomeActivity::class.java).apply {
                    //putExtra(EXTRA_MESSAGE, message)
                }
                startActivity(intent)
            }else{
                Toast.makeText(this, "Nope, failed", Toast.LENGTH_SHORT).show()
            }



        })

        binding.buttonLogin.setOnClickListener { login() }



    }
    private fun login() {
        val email = binding.editTextTextEmailAddress.text.toString().trim()
        val password = binding.editTextTextPassword.text.toString().trim()
        jwtViewModel.login(email, password)
    }
}
