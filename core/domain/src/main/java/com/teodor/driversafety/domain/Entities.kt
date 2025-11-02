package com.teodor.driversafety.domain

data class VehicleDistance(val meters: Float, val confidence: Float)
data class LaneDepartureEvent(val direction: Direction, val confidence: Float)
enum class Direction { LEFT, RIGHT }

data class AffiliateAction(val type: AffiliateType, val partnerId: String, val metadata: Map<String, String>)
enum class AffiliateType { REFUEL, INSURANCE }

data class Entitlement(val pro: Boolean, val expiresAt: Long?)
data class ExperimentBucket(val key: String, val variant: String)

fun interface UseCase<in I, out O> { suspend operator fun invoke(input: I): O }
