package com.project.appicoclear.activites.viewsAccounts.paciente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.appicoclear.R
import kotlinx.android.synthetic.main.activity_main_pacient.*
import kotlinx.android.synthetic.main.activity_paciente_mainn.*

class MainPacientActivity : AppCompatActivity() {
    private lateinit var rvadapter: RecyclerView.Adapter<*>
    private lateinit var viewlayoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pacient)
        viewlayoutManager = LinearLayoutManager(this)
        rvadapter = PacienteAdapter(Supplier.pacientes)
        rv.apply {
            layoutManager = viewlayoutManager
            adapter = rvadapter
        }
    }

}
