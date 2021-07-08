package ru.inohunk.utils_library

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import ru.inohunk.utils_library.android.isBleSupported
import ru.inohunk.utils_library.android.toBundle

@RunWith(AndroidJUnit4::class)
class TestAndroidUtils {
    private lateinit var context: Context

    @Before
    fun init() {
        context = ApplicationProvider.getApplicationContext()
    }

    @Test
    fun testBluetooth() {
        val isBleSupported = context.isBleSupported()
        Assert.assertEquals(isBleSupported, true)
    }

    @Test
    fun testConvertingMapToBundle() {
        val testPair = Pair("Test", "Value")
        val map = mapOf(
            testPair
        )
        val converted = map.toBundle()
        println(converted)
        Assert.assertEquals(
            converted.containsKey(testPair.first),
            true
        )
        Assert.assertEquals(
            converted[testPair.first]?.equals(testPair.second),
            true
        )
    }

    @After
    fun close() {

    }
}