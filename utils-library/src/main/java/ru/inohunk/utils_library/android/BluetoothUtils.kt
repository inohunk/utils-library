package ru.inohunk.utils_library.android

import android.bluetooth.BluetoothAdapter
import android.content.Context
import android.content.pm.PackageManager

fun Context.isBleSupported(): Boolean {
    return BluetoothAdapter.getDefaultAdapter() != null
            && this.packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)
}