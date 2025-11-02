plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.hilt)
  kotlin("kapt")
}

android {
  namespace = "com.teodor.driversafety"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.teodor.driversafety"
    minSdk = 26
    targetSdk = 35
    versionCode = 1
    versionName = "0.1.0"
    vectorDrawables { useSupportLibrary = true }
  }

  flavorDimensions += listOf("tier")
  productFlavors {
    create("free") { dimension = "tier" }
    create("pro") { dimension = "tier" }
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
    debug { applicationIdSuffix = ".debug" }
  }

  buildFeatures { compose = true }
  composeOptions { kotlinCompilerExtensionVersion = "1.5.4" }
  packaging { resources.excludes += "/META-INF/{AL2.0,LGPL2.1}" }
}

dependencies {
  implementation(project(":core:ui"))
  implementation(project(":core:analytics"))

  implementation(project(":feature:onboarding"))
  implementation(project(":feature:camera"))
  implementation(project(":feature:distance"))
  implementation(project(":feature:lane"))
  implementation(project(":feature:drowsiness"))
  implementation(project(":feature:settings"))
  implementation(project(":feature:paywall"))
  implementation(project(":feature:affiliates"))
  implementation(project(":feature:growth"))

  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.ui)
  implementation(libs.androidx.ui.graphics)
  implementation(libs.androidx.material3)
  debugImplementation(libs.androidx.ui.tooling)

  implementation(libs.hilt.android)
  kapt(libs.hilt.compiler)

  implementation(libs.play.billing)
  implementation(libs.play.review)
  implementation(libs.play.update)

  // Firebase (can be removed or guarded by flavor)
  implementation(platform(libs.firebase.bom))
  implementation(libs.firebase.analytics)
  implementation(libs.firebase.config)
  implementation(libs.firebase.crashlytics)
}
