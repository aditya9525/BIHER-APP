package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_iunit1.*
import kotlinx.android.synthetic.main.activity_iunit2.*

class IUnit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iunit2)
        IpdfView2.fromAsset("iotUnit2.pdf").load()

    }
}