package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sunit1.*
import kotlinx.android.synthetic.main.activity_sunit2.*

class SUnit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunit2)
        SpdfView2.fromAsset("seUnit2.pdf").load()

    }
}