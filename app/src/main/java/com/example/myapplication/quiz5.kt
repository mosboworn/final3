package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_quiz5.*

class quiz5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz5)

        qa5.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qb5.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }
        qc5.setOnClickListener {
            Toast.makeText(this,"ท่านตอบคำถามถูกครบทุกข้อแล้วยินดีด้วย", Toast.LENGTH_LONG).show()
        }
        qd5.setOnClickListener {
            Toast.makeText(this,"คำตอบที่ท่านเลือกเป็นคำตอบที่ผิด", Toast.LENGTH_LONG).show()
        }

    }
}