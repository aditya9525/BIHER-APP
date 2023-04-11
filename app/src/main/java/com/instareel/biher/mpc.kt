package com.instareel.biher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class mpc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mpc)
    }

    fun pdfView(view: View) {
        val intent = Intent(this, MUnit1::class.java)
        startActivity(intent)
    }
    fun pdfView2(view: View) {
        val intent2 = Intent(this, MUnit2::class.java)
        startActivity(intent2)
    }
    fun pdfView3(view: View) {
        val intent3 = Intent(this, MUnit3::class.java)
        startActivity(intent3)
    }
    fun pdfView4(view: View) {
        Toast.makeText(this, "PDF not there", Toast.LENGTH_SHORT).show()
    }
    fun pdfView5(view: View) {
        Toast.makeText(this, "PDF not there", Toast.LENGTH_SHORT).show()
    }
}