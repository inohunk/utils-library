# Utils library (Android & Kotlin)



## Android utils

---

#### BluetoothUtils

* isBleSupported() - checks if device has bluetooth

  ```kotlin
  //MainActivity.kt
  
  override fun onCreate(savedInstanceState: Bundle?) {
      if(isBleSupported()) {
          //do anything
      } else {
          //do anything
      }
  }
  ```



#### BundleUtils

* toBundle() - converts Map<String, T:Seriazable> to bundle

```kotlin
val map = mapOf(
    Pair("Test", "Value")
)
val converted = map.toBundle()
```



#### IntentUtils

* openAppSettings()  - open system app settings

```kotlin
//MainActivity.kt

override fun onCreate(savedInstanceState: Bundle?) {
    //...checking for gps permission example
    val gpsPermissionGranted = false
    val gpsPermissionAllowToRequest = false
    
    if(gpsPermissionGranted.not() & gpsPermissionAllowToRequest.not()){
        //Show a pop-up with a warning that you can't request the necessary permissions
      	//And then open app settings
        openAppSettings()
    }
}
```

* openAppNotificationsSettings() - open system app notifications settings (Supported on Android O and higher)

```kotlin
//MainActivity.kt

override fun onCreate(savedInstanceState: Bundle?) {
    //...checking for gps permission example
    val gpsPermissionGranted = false
    val gpsPermissionAllowToRequest = false
    
    if(gpsPermissionGranted.not() & gpsPermissionAllowToRequest.not()){
        //Show a pop-up with a warning that you can't request the necessary permissions
      	//And then open app settings
        openAppNotificationsSettings()
    }
}
```
