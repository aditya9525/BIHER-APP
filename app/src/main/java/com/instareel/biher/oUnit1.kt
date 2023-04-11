package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ounit1.*

class oUnit1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ounit1)
        OpdfView1.fromAsset("onUnit1.pdf").load()
    }
}