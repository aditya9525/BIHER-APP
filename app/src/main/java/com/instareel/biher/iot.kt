package com.instareel.biher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class iot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iot)
    }

    fun pdfView(view: View) {
        val intent = Intent(this, IUnit1::class.java)
        startActivity(intent)
    }
    fun pdfView2(view: View) {
        val intent2 = Intent(this, IUnit2::class.java)
        startActivity(intent2)
    }
    fun pdfView3(view: View) {
        val intent3 = Intent(this, IUnit3::class.java)
        startActivity(intent3)
    }
    fun pdfView4(view: View) {
        val intent4 = Intent(this, IUnit4::class.java)
        startActivity(intent4)
    }
    fun pdfView5(view: View) {
        val intent5 = Intent(this, IUnit5::class.java)
        startActivity(intent5)
    }
}