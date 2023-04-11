package com.instareel.biher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class DBMS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dbms)
    }

    fun pdfView(view: View) {
        val intent = Intent(this,dbunit1::class.java)
        startActivity(intent)
    }
    fun pdfView2(view: View) {
        val intent2 = Intent(this, dbunit2::class.java)
        startActivity(intent2)
    }
    fun pdfView3(view: View) {
        val intent3 = Intent(this, dbunit3::class.java)
        startActivity(intent3)
    }
    fun pdfView4(view: View) {
        Toast.makeText(this, "PDF not there", Toast.LENGTH_LONG).show()
    }
    fun pdfView5(view: View) {
        Toast.makeText(this, "PDF not there", Toast.LENGTH_LONG).show()
    }
}