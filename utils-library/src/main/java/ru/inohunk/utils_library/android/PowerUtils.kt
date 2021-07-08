package ru.inohunk.utils_library.android

import android.content.Context
import android.os.Build
import android.os.PowerManager
import androidx.core.content.ContextCompat

fun isIgnoringBatteryOptimizations(context: Context): Boolean {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val ctx = context.applicationContext
        val pm = ContextCompat.getSystemService(ctx, PowerManager::class.java)
        pm?.isIgnoringBatteryOptimizations(ctx.packageName) ?: false
    } else true
}