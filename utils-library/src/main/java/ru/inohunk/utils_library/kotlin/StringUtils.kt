package ru.inohunk.utils_library.kotlin

import java.util.regex.Pattern

const val EMPTY = ""
const val TAB = "\t"
const val CRLF = "\n"
const val SPACE = " "
const val COLON = ":"

val EMAIL_ADDRESS_PATTERN: Pattern = Pattern
    .compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" + "\\@"
                + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" + "(" + "\\."
                + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+"
    )

fun String.isValidEmail(): Boolean {
    return EMAIL_ADDRESS_PATTERN.matcher(this).matches()
}

fun String.asLong(): Long? {
    return if (this.isNotBlank() && this.isDigits())
        this.toLongOrNull()
    else {
        return null
    }
}

fun String.isDigits(): Boolean {
    val len: Int = this.length
    var cp: Int
    var i = 0
    while (i < len) {
        cp = Character.codePointAt(this, i)
        if (!Character.isDigit(cp)) {
            return false
        }
        i += Character.charCount(cp)
    }

    return true
}

/**
 * Removes all symbols from string exclude digits and +
 */
fun formatPhone(phone: String): String {
    val regex = Regex("[^0-9]+")
    return "+" + phone.replace(regex, "")
}