package com.example.euvoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


class JoinActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val btngab : Button = findViewById(R.id.btnGab)
        btngab.setOnClickListener(this)
        val bkicon : ImageView = findViewById(R.id.bckIcon)
        bkicon.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnGab -> {
                val intent = Intent(this@JoinActivity,MainclassActivity::class.java)
                startActivity(intent)
            }
            R.id.bckIcon ->{
                val intent = Intent(this@JoinActivity, KelasActivity::class.java)
                startActivity(intent)
            }
        }
    }
}