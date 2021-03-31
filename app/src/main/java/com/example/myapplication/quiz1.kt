package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz1.*

class quiz1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1)
        var su1=0
        qa1.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qb1.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qc1.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ถูกและสามารถไปยังข้อถัดไปได้", Toast.LENGTH_LONG).show()
            su1=1
        }
        qd1.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        goto1.setOnClickListener {
            if(su1==1){
                val it = Intent(this, quiz2::class.java)
                startActivity(it)
            }
            else {
                Toast.makeText(this, "กรุณาตอบคำถามให้ถูกต้องจึงจะไปข้อถัดไปได้", Toast.LENGTH_LONG).show()
            }
        }
    }
}