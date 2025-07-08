package com.aysusen.kotlincalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aysusen.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        }
    fun mySum(view: View){
        val number1=binding.numberText.text.toString().toDoubleOrNull()
        val number2=binding.numberText2.text.toString().toDoubleOrNull()

        if(number1!=null && number2!=null)
        {
            val result=number1!!+number2!!
            binding.textView.text="Result: ${result}"
        }
        else
        {
            binding.textView.text="Enter number!"
        }
    }
    fun mySubt(view: View){
        val number3=binding.numberText.text.toString().toDoubleOrNull()
        val number4=binding.numberText2.text.toString().toDoubleOrNull()

        if(number3!=null && number4!=null)
        {
            val result=number3!!-number4!!
            binding.textView.text="Result: ${result}"
        }
        else {
            binding.textView.text="Enter number!"
        }
    }
    fun myDiv(view: View){
        val number5=binding.numberText.text.toString().toDoubleOrNull()
        val number6=binding.numberText2.text.toString().toDoubleOrNull()

        if(number5!=null && number6!=null)
        {
            val result=number5!!/number6!!
            binding.textView.text="Result: ${result}"
        }
        else {
            binding.textView.text="Enter number!"
        }
    }
    fun myMulti(view: View){
        val number7=binding.numberText.text.toString().toDoubleOrNull()
        val number8=binding.numberText2.text.toString().toDoubleOrNull()

        if(number7!=null && number8!=null)
        {
            val result=number7!!*number8!!
            binding.textView.text="Result: ${result}"
        }
        else {
            binding.textView.text="Enter number!"
        }
    }
    }
