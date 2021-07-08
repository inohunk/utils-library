package ru.inohunk.utils_library.android

import android.os.Bundle
import java.io.Serializable

fun <T : Serializable> Map<String, T>.toBundle(): Bundle {
    val bundle = Bundle()
    if (this.isEmpty()) return bundle
    this.entries.forEach {
        bundle.putSerializable(it.key, it.value)
    }
    return bundle
}

