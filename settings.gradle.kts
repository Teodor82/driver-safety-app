pluginManagement {
  includeBuild("build-logic")
  repositories { gradlePluginPortal(); google(); mavenCentral() }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories { google(); mavenCentral() }
  versionCatalogs { create("libs") { from(files("gradle/libs.versions.toml")) } }
}

rootProject.name = "driver-safety-app"
include(
  ":app",
  ":core:common", ":core:ui", ":core:domain", ":core:analytics", ":core:testing",
  ":data:sensors", ":data:ml", ":data:storage", ":data:monetization", ":data:remoteconfig",
  ":feature:onboarding", ":feature:camera", ":feature:distance", ":feature:lane", ":feature:drowsiness",
  ":feature:settings", ":feature:paywall", ":feature:affiliates", ":feature:growth",
  ":wearable"
)
