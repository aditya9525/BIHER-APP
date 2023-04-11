package com.instareel.biher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operatingSystem(view: View) {
        val intent = Intent(this, oparatingSystem::class.java)
        startActivity(intent)
    }
    fun dbms(view: View) {
        val intent2 = Intent(this, DBMS::class.java)
        startActivity(intent2)
    }
    fun mpc(view: View) {
        val intent3 = Intent(this, mpc::class.java)
        startActivity(intent3)
    }
    fun iot(view: View) {
        val intent4 = Intent(this, iot::class.java)
        startActivity(intent4)
    }
    fun se(view: View) {
        val intent5 = Intent(this, SE::class.java)
        startActivity(intent5)
    }
    fun maths(view: View) {
        val intent6 = Intent(this, Maths::class.java)
        startActivity(intent6)
    }
}