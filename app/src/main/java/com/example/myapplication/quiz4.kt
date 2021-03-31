package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz1.*

import kotlinx.android.synthetic.main.activity_quiz3.*

import kotlinx.android.synthetic.main.activity_quiz4.*

class quiz4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz4)
        var su4=0
        qa4.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qb4.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qc4.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ถูกและสามารถไปยังข้อถัดไปได้", Toast.LENGTH_LONG).show()
            su4=1
        }
        qd4.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        goto4.setOnClickListener {
            if(su4==1){
                val it = Intent(this, quiz5::class.java)
                startActivity(it)
            }
            else {
                Toast.makeText(this, "กรุณาตอบคำถามให้ถูกต้องจึงจะไปข้อถัดไปได้", Toast.LENGTH_LONG).show()
            }
        }
    }
}