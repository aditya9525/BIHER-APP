package com.instareel.biher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dbunit1.*
import kotlinx.android.synthetic.main.activity_dbunit2.*

class dbunit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dbunit2)
        pdfView2.fromAsset("secondUnit.pdf").load()
    }
}