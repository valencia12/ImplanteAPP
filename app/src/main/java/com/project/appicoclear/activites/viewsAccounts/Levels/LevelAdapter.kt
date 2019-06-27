package com.project.appicoclear.activites.viewsAccounts.Levels

//import android.view.MotionEvent

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.appicoclear.R
import kotlinx.android.synthetic.main.list_itemss.view.*

//import com.saenz.terapeuta.R

class LevelAdapter(private val myDataset: List<Level_1>,context: Context) :  RecyclerView.Adapter<LevelAdapter.MyViewHolder>() {
    private var contex: Context=context
    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): LevelAdapter.MyViewHolder {
        // create a new view
       // val view = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_itemss,parent,false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val media = myDataset[position]

        holder.setData( media,contex)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun setData(media: Level_1?,context: Context){
            itemView.txvTitle.text = media!!.title
            itemView.imgShare.setImageResource(media.img)
            var mediaPlayer: MediaPlayer
            mediaPlayer = MediaPlayer.create(context,media.snd)


            itemView.setOnClickListener {
                //mediaPlayer.pause()
                mediaPlayer.start()
            }
        }
    }
}