package com.ecirstea.creepyrabbit.ui.view

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ecirstea.creepyrabbit.R
import com.ecirstea.creepyrabbit.data.model.multimedia.MultimediaData
import com.ecirstea.creepyrabbit.databinding.ActivityMainBinding
import com.ecirstea.creepyrabbit.ui.adapter.RecyclerAdapter
import com.ecirstea.creepyrabbit.ui.viewmodel.MultimediaFileViewModel
import kotlinx.android.synthetic.main.activity_home.*

const val TAG = "TAG"
class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val medataList: MultimediaFileViewModel by viewModels()
    private val viewModel by lazy { ViewModelProvider(this)[MultimediaFileViewModel::class.java]}
    private lateinit var adapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_home)
      //  binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        Log.d(TAG, "onCreate HomeActivity: before observe call")
        rvAudioList.layoutManager = LinearLayoutManager(this)
        adapter = RecyclerAdapter(this)
        rvAudioList.adapter = adapter
        observeData()
      /*  val dummyList = mutableListOf<MultimediaData>()
        dummyList.add(
            MultimediaData("url","Mikel","rules","url image","1",
            "mr creeps","I bought a new house which comes with 3 rules")
        )

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()*/




    /*    initRecycler()
        medataList.results.observe(this, Observer {
            Log.d(TAG, "onCreate HomeActivity: mehhh???")
            Log.d(TAG, "onCreate HomeActivity: ${it.size}")
            if (it?.size != 0) {
                it[0]
                Log.d(TAG, "onCreate HomeActivity: ${it[0]}")

            } else {
                Toast.makeText(this, "Nope, failed", Toast.LENGTH_SHORT).show()
            }

        })*/
    }

    private fun initRecycler() {
        Log.d(TAG, "initRecycler ")

        medataList.getAudios()
    }

    fun observeData () {
        shimmer_view_container.startShimmer()
        viewModel.getAudios().observe(this, {
            shimmer_view_container.stopShimmer()
            shimmer_view_container.visibility = View.GONE
            adapter.setListData(it)
            adapter.notifyDataSetChanged()
        })
    }

}