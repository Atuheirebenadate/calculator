package com.example.calic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edText:EditText
    lateinit var edOut:EditText
    lateinit var btnBmi:Button
    lateinit var btnMinus:Button
    lateinit var btnModel:Button
    lateinit var btnMult:Button
    lateinit var tvResult:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edText=findViewById(R.id.edText)
        edOut=findViewById(R.id.edOut)
        btnBmi=findViewById(R.id.btnBmi)
        btnMinus=findViewById(R.id.btnMinus)
        btnModel=findViewById(R.id.btnmodel)
        btnMult=findViewById(R.id.btnMult)
        tvResult=findViewById(R.id.tvResult)

          btnBmi.setOnClickListener {
            var number=edText.text.toString() .toInt()
            var numb =edOut.text.toString() .toInt()
            getResult(number,numb)
        }

          btnMinus.setOnClickListener {
               var number=edText.text.toString() .toInt()
                var numb=edOut.text.toString() .toInt()
                getResult2(number,numb)
            }
           btnModel.setOnClickListener {
            var number=edText.text.toString() .toInt()
            var numb=edOut.text.toString() .toInt()
            getResult3(number,numb)
        }
          btnMult.setOnClickListener {
            var number=edText.text.toString() .toInt()
            var numb=edOut.text.toString() .toInt()
            getResult4(number,numb)
        }


    }

    fun getResult(number:Int,numb:Int){
        var result=number+numb
        tvResult.text.toString()

    }
fun getResult2(number: Int,numb: Int){
var result =number/numb
    tvResult.text.toString()
}
    fun getResult3(number: Int,numb: Int){
        var result =number%numb
        tvResult.text.toString()
    }
    fun getResult4(number: Int,numb: Int){
        var result =number*numb
        tvResult.text.toString()
    }

}