package ru.inohunk.utils_library.android

import android.content.Context
import android.location.LocationManager

private fun isGpsEnabled(context: Context): Boolean {
    val manager: LocationManager =
        context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
    return manager.isProviderEnabled(LocationManager.GPS_PROVIDER)
}