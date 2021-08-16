package com.ecirstea.creepyrabbit.ui.adapter


import android.content.Context
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ecirstea.creepyrabbit.R
import com.ecirstea.creepyrabbit.data.model.multimedia.MultimediaData
import kotlinx.android.synthetic.main.item_audio_list.view.*


//class RecyclerAdapter(val multimediaDataList: List<MultimediaData>) : RecyclerView.Adapter<RecyclerAdapter.MetadataHolder>() {
class RecyclerAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerAdapter.MetadataHolder>() {
    private var multimediaDataList = mutableListOf<MultimediaData>()
    fun setListData(data: MutableList<MultimediaData>){
        multimediaDataList= data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MetadataHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return MetadataHolder(layoutInflater.inflate(R.layout.item_audio_list, parent, false))
    }

    override fun onBindViewHolder(holder: MetadataHolder, position: Int) {
        holder.render(multimediaDataList[position])
    }

    override fun getItemCount(): Int {
        return if (multimediaDataList.size >0 ){
            multimediaDataList.size
        }else{
            0
        }
    }



    inner class MetadataHolder(val view: View): RecyclerView.ViewHolder(view){
        fun render(metadata: MultimediaData){

            view.tvAuthor.text = metadata.author
            view.tvNarrator.text = metadata.narrator
            view.tvTitle.text= metadata.title
            view.tvCategory.text = metadata.category
            view.setOnClickListener{
                Toast.makeText(view.context, "has seleccionado a  ${metadata.author}",Toast.LENGTH_LONG).show()
            }
        }
  }




}