package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ounit2.*

class oUnit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ounit2)
        OpdfView2.fromAsset("osUnit2.pdf").load()
    }
}