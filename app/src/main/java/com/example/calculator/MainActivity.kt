package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var str = ""
        binding.btn0.setOnClickListener {
                str += "0"
                binding.resultText.text = str
        }

        binding.btn1.setOnClickListener {
            str+="1"
            binding.resultText.text = str
        }
        binding.btn2.setOnClickListener {
            str+="2"
            binding.resultText.text = str
        }
        binding.btn3.setOnClickListener {
            str+="3"
            binding.resultText.text = str
        }
        binding.btn4.setOnClickListener {
            str+="4"
            binding.resultText.text = str
        }
        binding.btn5.setOnClickListener {
            str+="5"
            binding.resultText.text = str

        }
        binding.btn6.setOnClickListener {
            str+="6"
            binding.resultText.text = str

        }
        binding.btn7.setOnClickListener {
            str+="7"
            binding.resultText.text = str

        }
        binding.btn8.setOnClickListener {
            str+="8"
            binding.resultText.text = str
        }
        binding.btn9.setOnClickListener {
            str+="9"
            binding.resultText.text = str
        }
        binding.btnPlus.setOnClickListener {
                str+="+"
                binding.resultText.text = str

            //flag = false
        }

        binding.btnReset.setOnClickListener {
            str=""
            binding.resultText.text = "0"
        }
        binding.btnEqual.setOnClickListener {
            var totalSum = 0
            var arr = str.split("+")
            for(i in arr){
                totalSum+=i.toInt();
            }
            str = totalSum.toString()
            binding.resultText.text=str
        }

    }
}