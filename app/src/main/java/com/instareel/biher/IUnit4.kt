package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_iunit1.*
import kotlinx.android.synthetic.main.activity_iunit4.*

class IUnit4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iunit4)
        IpdfView4.fromAsset("iotUnit4.pdf").load()
    }
}