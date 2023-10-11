package com.example.euvoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class KelasActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas)

        val btnplus : ImageView = findViewById(R.id.btPlus)
        btnplus.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btPlus ->{

                val intent = Intent(this@KelasActivity, JoinActivity::class.java)
                startActivity(intent)

            }


        }
    }
}