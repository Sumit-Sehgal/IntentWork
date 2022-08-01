package com.example.intentwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var stg:EditText
    lateinit var num:EditText
    lateinit var chr:EditText
    lateinit var db:EditText
    lateinit var lng:EditText
    lateinit var floats:EditText
    lateinit var boolt:RadioButton
    lateinit var boolf:RadioButton
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stg= findViewById(R.id.stg)
        num=findViewById(R.id.num)
        chr=findViewById(R.id.chr)
        db=findViewById(R.id.db)
        lng=findViewById(R.id.lng)
        floats=findViewById(R.id.floats)
        boolt=findViewById(R.id.boolt)
        boolf=findViewById(R.id.boolf)
        btn=findViewById(R.id.btn)
        btn.setOnClickListener {
            var intent=Intent(this,NewPage::class.java)
            intent.putExtra("string",stg.text.toString())
            intent.putExtra("number",Integer.parseInt(num.text.toString()))
            intent.putExtra("char",chr.text.toString())
            intent.putExtra("double",(db.text.toString()).toDouble())
            intent.putExtra("long",(lng.text.toString()).toLong())
            intent.putExtra("Float",(floats.text.toString()).toFloat())
            if (boolt.isChecked==true) {
                intent.putExtra("bool","true")
            }
            else{
                intent.putExtra("bool", "false")
            }
            startActivity(intent)
        }

    }
}