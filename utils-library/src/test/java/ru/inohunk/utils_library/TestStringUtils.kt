package ru.inohunk.utils_library

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import ru.inohunk.utils_library.kotlin.asLong
import ru.inohunk.utils_library.kotlin.isValidEmail

@RunWith(JUnit4::class)
class TestStringUtils {
    @Test
    fun testIsValidEmail() {
        val validEmail = "main@mail.ri"
        val invalidEmail = "mail#fa.ri"
        Assert.assertEquals(validEmail.isValidEmail(), true)
        Assert.assertEquals(invalidEmail.isValidEmail(), false)
    }

    @Test
    fun testConvertingStringToLong() {
        val longInString = "45"
        val notLongInString = "22t"
        Assert.assertEquals(longInString.asLong(), 45L)
        Assert.assertEquals(notLongInString.asLong() == null, true)
    }
}