plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
}
android {
  namespace = "com.teodor.driversafety.data.remoteconfig"
  compileSdk = 35
  defaultConfig { minSdk = 26 }
}
dependencies {
  implementation(libs.androidx.core.ktx)
}
