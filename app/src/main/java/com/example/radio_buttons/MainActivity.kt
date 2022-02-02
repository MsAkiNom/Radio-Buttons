package com.example.radio_buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val myRadioGroup = findViewById<RadioGroup>(R.id.myRadioGroup)

//        myRadioGroup.setOnCheckedChangeListener { _, index ->
//            val tappedRadioButton = findViewById<RadioButton>(index)
//
//            Toast.makeText(this,
//            "Checked ${tappedRadioButton.text}",
//            Toast.LENGTH_LONG).show()
//        }
    }
    fun radioButtonTapped (v: View)
    {
//        val myRadioGroup = findViewById<RadioGroup>(R.id.myRadioGroup)
//        val radio: RadioButton = findViewById(myRadioGroup.checkedRadioButtonId)

        val radioButton = v as RadioButton
        Toast.makeText(this,
            "Checked ${radioButton.text}",
            Toast.LENGTH_LONG).show()

    }
}