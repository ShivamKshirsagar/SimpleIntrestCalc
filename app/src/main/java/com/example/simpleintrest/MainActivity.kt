package com.example.simpleintrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var amt : TextInputEditText = findViewById(R.id.etPrincipal)
        var rate : TextInputEditText = findViewById(R.id.etRate)
        var time : TextInputEditText = findViewById(R.id.etTime)
        var show : TextView = findViewById(R.id.ans)

        var btn : Button = findViewById(R.id.button)

        btn.setOnClickListener()
        {
            val a: Int = ((amt.text.toString().toInt()) * (rate.text.toString().toInt()) *(time.text.toString().toInt()))/100

            show.text = "Interest : $a"+"\nTotal Ammount : "+(amt.text.toString().toInt()+a)
        }
    }
}