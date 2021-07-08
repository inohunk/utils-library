package ru.inohunk.utils_library.android

import android.os.SystemClock
import android.view.View

class SafeClickListener(
    private var clickInterval: Long = 400L,
    private val onSafeClick: (View) -> Unit
//    , private val onClickBlocked: () -> Unit
) : View.OnClickListener {
    private var lastTimeClicked: Long = 0

    @Throws(IllegalStateException::class)
    override fun onClick(v: View?) {
        if (SystemClock.elapsedRealtime() - lastTimeClicked < clickInterval) {
//            onClickBlocked()
            return
        }
        lastTimeClicked = SystemClock.elapsedRealtime()
        if (v == null) {
            throw IllegalStateException()
        } else {
            onSafeClick(v)
        }
    }
}

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}