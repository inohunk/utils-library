package ru.inohunk.utils_library.android

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.annotation.RequiresApi

const val PACKAGE = "package"

fun Context.openAppSettings() {
    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
    val uri: Uri = Uri.fromParts(PACKAGE, this.packageName, null)
    intent.data = uri
    this.startActivity(intent)
}

@RequiresApi(Build.VERSION_CODES.O)
fun openAppNotificationsSettings(context: Context) {
    val settingsIntent: Intent =
        Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            .putExtra(Settings.EXTRA_APP_PACKAGE, context.packageName)
    context.startActivity(settingsIntent)
}