package com.example.imagescroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private val min_index = 0
    private val max_index = 10
    private var current_index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val image_view = findViewById<ImageView>(R.id.imageView)
        val prev_button = findViewById<Button>(R.id.prev_button)
        val next_button = findViewById<Button>(R.id.next_button)
        val first_button = findViewById<Button>(R.id.first_button)
        val last_button = findViewById<Button>(R.id.last_button)



        prev_button.setOnClickListener(){
            current_index --
            if (current_index < min_index)
                current_index = max_index
            setNewImage(current_index, image_view)
        }
        next_button.setOnClickListener(){
            current_index ++
            if (current_index > max_index)
                current_index = min_index

            setNewImage(current_index, image_view)
        }
        first_button.setOnClickListener(){
            current_index = min_index
            setNewImage(current_index, image_view)
        }
        last_button.setOnClickListener(){
            current_index = max_index
            setNewImage(current_index, image_view)

        }
    }
    private fun setNewImage(index: Int, imageView: ImageView){
        val resId = when(index){
            0 -> R.drawable.im0
            1 -> R.drawable.im1
            2 -> R.drawable.im2
            3 -> R.drawable.im3
            4 -> R.drawable.im4
            5 -> R.drawable.im5
            6 -> R.drawable.im6
            7 -> R.drawable.im7
            8 -> R.drawable.im8
            9 -> R.drawable.im9
            10 -> R.drawable.im10
            else -> R.drawable.im0
        }

        imageView.setImageResource(resId)
    }




}