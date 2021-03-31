package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz1.*

import kotlinx.android.synthetic.main.activity_quiz2.*

class quiz2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)
        var su2 = 0
        qa2.setOnClickListener {
            Toast.makeText(
                this,
                "คำตอบที่ท่านเลือกเป็นคำตอบที่ถูกและสามารถไปยังข้อถัดไปได้",
                Toast.LENGTH_LONG
            ).show()
            su2 = 1
        }
        qb2.setOnClickListener {
            Toast.makeText(this, "คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qc2.setOnClickListener {
            Toast.makeText(
                this,
                "คำตอบที่ท่านเลือกเป็นคำตอบที่ถูกและสามารถไปยังข้อถัดไปได้",
                Toast.LENGTH_LONG
            ).show()
            su2 = 1
        }
        qd2.setOnClickListener {
            Toast.makeText(this, "คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        goto2.setOnClickListener {
            if (su2 == 1) {
                val it = Intent(this, quiz3::class.java)
                startActivity(it)
            } else {
                Toast.makeText(this, "กรุณาตอบคำถามให้ถูกต้องจึงจะไปข้อถัดไปได้", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}