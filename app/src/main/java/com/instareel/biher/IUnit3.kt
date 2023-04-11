package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_iunit2.*
import kotlinx.android.synthetic.main.activity_iunit3.*

class IUnit3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iunit3)
        IpdfView3.fromAsset("iotUnit3.pdf").load()
    }
}