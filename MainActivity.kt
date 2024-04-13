package com.example.makingtoast

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button;
    private lateinit var falseButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting references to widgets
        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);

        //setting listeners
        trueButton.setOnClickListener {
            Toast.makeText(this,"Wrong answer",Toast.LENGTH_LONG).show()
        }
        falseButton.setOnClickListener {
            Toast.makeText(this,"Correct answer",Toast.LENGTH_LONG).show()
        }
    }
}