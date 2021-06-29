package com.example.autoreadotp

import android.app.Application
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi

class MyApplication: Application() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate() {
        super.onCreate()

        // This code requires one time to get Hash keys do comment and share key
        val appSignature = AppSignatureHelper(this)
        Log.v("AppSignature", appSignature.appSignatures.toString())
    }
}