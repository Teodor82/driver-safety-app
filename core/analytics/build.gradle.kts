plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.teodor.driversafety.analytics"
  compileSdk = 35
  defaultConfig { minSdk = 26 }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  // Firebase analytics present in app; here we keep only interfaces
}
