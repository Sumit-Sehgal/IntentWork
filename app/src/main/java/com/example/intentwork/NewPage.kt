package com.example.intentwork

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewPage : AppCompatActivity() {
    lateinit var getstg:TextView
    lateinit var getnum:TextView
    lateinit var getchr:TextView
    lateinit var getlng:TextView
    lateinit var getdb:TextView
    lateinit var getfloats:TextView
    lateinit var getbool:TextView
    var stg:String = ""
    var num:Int=0
    var chr:Char= 'a'
    var lng:Long= 0
    var db:Double= 0.0
    var floats:Float= 0.0F
//    var bool:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)
        getstg=findViewById(R.id.getstg)
        getnum=findViewById(R.id.getnum)
        getchr=findViewById(R.id.getchr)
        getlng=findViewById(R.id.getlng)
        getdb=findViewById(R.id.getdb)
        getfloats=findViewById(R.id.getfloats)
//        getbool=findViewById(R.id.getbool)
        intent?.let {
            stg = it.getStringExtra("string").toString()
            num = it.getIntExtra("number",0)
            chr = it.getCharExtra("char",'a')
            lng = it.getLongExtra("lng",0)
            db= it.getDoubleExtra("db",0.0)
            floats = it.getFloatExtra("floats",0.0F)
//            bool = it.getBooleanExtra("bool",true)
        }
        getstg.setText(stg)
        getnum.setText(num.toString())
        getchr.setText(""+chr)
        getlng.setText(""+lng.toString())
        getdb.setText(""+db.toString())
        getfloats.setText(""+floats.toString())
//        getbool.setText(""+bool.toString())


    }
}


