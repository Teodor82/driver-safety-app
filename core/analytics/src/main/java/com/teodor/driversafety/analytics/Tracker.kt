package com.teodor.driversafety.analytics

interface Tracker {
  fun log(event: String, params: Map<String, Any?> = emptyMap())
}
