package com.example.euvoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class InkelasActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inkelas)

        val icmat : ImageView = findViewById(R.id.icMat)
        icmat.setOnClickListener(this)
        val bkicon : ImageView = findViewById(R.id.bckIcon)
        bkicon.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.icMat ->{
                val intent = Intent(this@InkelasActivity, MateriActivity::class.java)
                startActivity(intent)
        }
            R.id.bckIcon ->{
                val intent = Intent(this@InkelasActivity, MainclassActivity::class.java)
                startActivity(intent)

            }
        }

    }
}