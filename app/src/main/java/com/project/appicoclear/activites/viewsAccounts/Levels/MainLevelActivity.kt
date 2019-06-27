package com.project.appicoclear.activites.viewsAccounts.Levels

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.appicoclear.R
import kotlinx.android.synthetic.main.activity_mainn.*

class MainLevelActivity : AppCompatActivity() {

    private lateinit var rvadapter: RecyclerView.Adapter<*>
    private lateinit var viewlayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainn)

        val myIntent: Intent = intent
        var opc = myIntent.getStringExtra("opc") //actividad donde se genera un el expediente de un paciente

        when(opc) {
            "1" -> rvadapter = LevelAdapter(Supplier.animals,this)
            "2" -> rvadapter = LevelAdapter(Supplier.palabras,this)
            "3" -> rvadapter = LevelAdapter(Supplier.oraciones,this)
            "4" -> rvadapter = LevelAdapter(Supplier.conversaciones,this)
        }

        viewlayoutManager = LinearLayoutManager(this)
       // rvadapter = LevelAdapter(Supplier.animals,this)

        rv.apply {
            layoutManager = viewlayoutManager
            adapter = rvadapter
        }
    }
}