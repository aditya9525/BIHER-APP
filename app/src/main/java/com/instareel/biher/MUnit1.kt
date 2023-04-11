package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_munit1.*

class MUnit1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_munit1)
        MpdfView1.fromAsset("mUnit1.pdf").load()
    }
}