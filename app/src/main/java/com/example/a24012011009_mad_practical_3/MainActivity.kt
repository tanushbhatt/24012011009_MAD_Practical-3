package com.example.a24012011009_mad_practical_3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        implicitIntent()
        explicitIntent()
    }

    fun implicitIntent(){
        findViewById<Button>(R.id.btn_browse).setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse(findViewById<EditText>(R.id.editTextText2).text.toString())).also {
                startActivity(it)
            }
        }


        val callButton = findViewById<Button>(R.id.btn_call)
        callButton.setOnClickListener {

            val number = findViewById<EditText>(R.id.editTextPhone).text.toString() // use to
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData("tel: $number".toUri())
            startActivity(intent)
        }
    }

    fun explicitIntent(){

    }

}