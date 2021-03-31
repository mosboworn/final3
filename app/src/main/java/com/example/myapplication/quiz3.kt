package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz1.*
import kotlinx.android.synthetic.main.activity_quiz3.*

class quiz3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz3)
        var su3=0
        qa3.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qb3.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qc3.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qd3.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ถูกและสามารถไปยังข้อถัดไปได้", Toast.LENGTH_LONG).show()
            su3=1
        }
        goto3.setOnClickListener {
            if(su3==1){
                val it = Intent(this, quiz4::class.java)
                startActivity(it)
            }
            else {
                Toast.makeText(this, "กรุณาตอบคำถามให้ถูกต้องจึงจะไปข้อถัดไปได้", Toast.LENGTH_LONG).show()
            }
        }
    }
}