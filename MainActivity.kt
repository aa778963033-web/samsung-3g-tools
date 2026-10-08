// أدوات السامسونج 3G - عربي + نت + تثبيت شبكة
package com.samsung3gtools

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // زر 1: قلب عربي
        findViewById<Button>(R.id.btnArabic).setOnClickListener {
            startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
        }
        // زر 2: شغل النت
        findViewById<Button>(R.id.btnInternet).setOnClickListener {
            startActivity(Intent(Settings.ACTION_DATA_ROAMING_SETTINGS))
        }
        // زر 3: ثبت 3G - يفتح قائمة سامسونج السرية
        findViewById<Button>(R.id.btn3G).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:*#*#4636#*#*")
            startActivity(intent)
        }
    }
}