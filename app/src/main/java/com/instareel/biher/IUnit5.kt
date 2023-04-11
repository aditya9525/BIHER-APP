package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_iunit1.*
import kotlinx.android.synthetic.main.activity_iunit5.*

class IUnit5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iunit5)
        IpdfView5.fromAsset("iotUnit5.pdf").load()
    }
}