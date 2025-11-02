plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.teodor.driversafety.feature.camera"
  compileSdk = 35
  defaultConfig { minSdk = 26 }
  buildFeatures { compose = true }
  composeOptions { kotlinCompilerExtensionVersion = "1.5.4" }
}

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.ui)
  implementation(libs.androidx.material3)
  implementation(project(":core:ui"))
}
