package com.example.materigeturlfcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

lateinit var image1 : ImageView
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image1 = findViewById(R.id.imageView)


    }

    fun button1(view: View) {





    }


}
