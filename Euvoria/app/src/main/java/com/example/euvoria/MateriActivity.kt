package com.example.euvoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView


class MateriActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        val bkicon : ImageView = findViewById(R.id.bckIcon)
        bkicon.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.bckIcon -> {
                val intent = Intent(this@MateriActivity, InkelasActivity::class.java)
                startActivity(intent)
            }
        }

    }
}