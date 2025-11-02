plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.teodor.driversafety.domain"
  compileSdk = 35
  defaultConfig { minSdk = 26 }
}
