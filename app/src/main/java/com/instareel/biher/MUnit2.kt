package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_munit1.*
import kotlinx.android.synthetic.main.activity_munit2.*

class MUnit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_munit2)
        MpdfView2.fromAsset("mUnit2.pdf").load()

    }
}