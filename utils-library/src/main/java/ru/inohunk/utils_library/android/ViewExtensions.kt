package ru.inohunk.utils_library.android

import android.view.View
import android.widget.TextView

fun View.hideWithGone() {
    visibility = View.GONE
}

fun View.hide() {
    visibility = View.INVISIBLE
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.disable() {
    isEnabled = false
}

fun View.enable() {
    isEnabled = true
}

fun TextView.clear() {
    text = ""
}