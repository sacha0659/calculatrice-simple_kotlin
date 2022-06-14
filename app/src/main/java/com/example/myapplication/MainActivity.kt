package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        plus.setOnClickListener {
            var number1 = Number1.getText().toString()
            var number2 = Number2.getText().toString()
            var float1 : Float = number1.toFloat()
            var float2 : Float = number2.toFloat()
            var resultat = float1 + float2
            result.append("\n le total de "+ float1 + "+" + float2 +"=" + resultat )

}
        multiplier.setOnClickListener {
            var number1 = Number1.getText().toString()
            var number2 = Number2.getText().toString()
            var float1 : Float = number1.toFloat()
            var float2 : Float = number2.toFloat()
            var resultat = float1 * float2
            result.append("\n le total de "+ float1 + "X" + float2 +"=" + resultat )

        }
        moins.setOnClickListener {
            var number1 = Number1.getText().toString()
            var number2 = Number2.getText().toString()
            var float1 : Float = number1.toFloat()
            var float2 : Float = number2.toFloat()
            var resultat = float1 - float2
            result.append("\n le total de "+ float1 + "-" + float2 +"=" + resultat )

        }
        divise.setOnClickListener {
            var number1 = Number1.getText().toString()
            var number2 = Number2.getText().toString()
            var float1 : Float = number1.toFloat()
            var float2 : Float = number2.toFloat()
            var resultat = float1 / float2
            result.append("\n le total de "+ float1 + "/" + float2 +"=" + resultat )

        }

}

}
