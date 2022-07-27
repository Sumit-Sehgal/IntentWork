package com.example.intentwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var stg:EditText
    lateinit var num:EditText
    lateinit var chr:EditText
    lateinit var db:EditText
    lateinit var lng:EditText
    lateinit var floats:EditText
    lateinit var bool:EditText
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
        bool=findViewById(R.id.bool)
        btn=findViewById(R.id.btn)
        btn.setOnClickListener {
            var intent=Intent(this,NewPage::class.java)
            intent.putExtra("string",stg.text.toString())
            intent.putExtra("number",Integer.parseInt(num.text.toString()))
            intent.putExtra("char",chr.text.toString())
            intent.putExtra("double",db as Double)
            intent.putExtra("long",lng as Long)
            intent.putExtra("Float",floats as Float)
            intent.putExtra("bool",bool as Boolean)
            startActivity(intent)
        }

    }
}