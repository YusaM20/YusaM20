package com.example.euvoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView


class MainclassActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainclass)

        val mtkel : ImageView = findViewById(R.id.mtk)
        mtkel.setOnClickListener(this)
        val bkicon : ImageView = findViewById(R.id.bckIcon)
        bkicon.setOnClickListener(this)
        val kmkel : ImageView = findViewById(R.id.kimia)
        kmkel.setOnClickListener(this)
        val mtbio : ImageView = findViewById(R.id.biolog)
        mtbio.setOnClickListener(this)
        val btnplus : ImageView = findViewById(R.id.btnPlus)
        btnplus.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.mtk -> {
                val intent = Intent(this@MainclassActivity, InkelasActivity::class.java)
                startActivity(intent)
            }
            R.id.bckIcon ->{
                val intent = Intent(this@MainclassActivity, JoinActivity::class.java)
                startActivity(intent)
            }
            R.id.kimia -> {
                val intent = Intent(this@MainclassActivity, InkimActivity::class.java)
                startActivity(intent)
            }
            R.id.biolog -> {
                val intent = Intent(this@MainclassActivity, InbiActivity::class.java)
                startActivity(intent)
            }
            R.id.btnPlus ->{

                val intent = Intent(this@MainclassActivity, JoinActivity::class.java)
                startActivity(intent)

            }
        }

    }
}