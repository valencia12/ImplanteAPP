package com.example.appicoclear

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.appicoclear.utils.salir
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home_user.*

class HomeUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_user)

        setSupportActionBar(toolbar)
        val navController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupWithNavController(nav_view, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawer_layout)
    }
    override fun onSupportNavigateUp(): Boolean{
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.fragment), drawer_layout)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.opcion_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.action_salir){

            AlertDialog.Builder(this).apply{
                setTitle("¿Estas seguro?")
                setPositiveButton("Aceptar"){ _, _ ->
                    FirebaseAuth.getInstance().signOut()
                    salir()

                }
                setNegativeButton("Cancelar"){ _, _ ->
                }
            }.create().show()

        }
        return super.onOptionsItemSelected(item)
    }
}
