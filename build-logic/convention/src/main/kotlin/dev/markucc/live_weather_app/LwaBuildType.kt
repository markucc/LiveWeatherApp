package dev.markucc.live_weather_app
/**
 * This is shared between :app and :benchmarks module to provide configurations type safety.
 */
@Suppress("unused")
enum class LwaBuildType(
    val applicationIdSuffix: String? = null
) {
    DEBUG(".debug"),
    RELEASE,
    BENCHMARK(".benchmark")
}
