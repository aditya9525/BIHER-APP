package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sunit3.*

class SUnit3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunit3)
        SpdfView3.fromAsset("seUnit3.pdf").load()
    }
}