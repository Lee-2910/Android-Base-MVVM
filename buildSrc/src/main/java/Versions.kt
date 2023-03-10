object Kotlin {
    const val stdlibVersion = "1.7.20"

    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$stdlibVersion"
}

object AndroidUI {
    private const val coreXVersion = "1.7.0"
    private const val appcompatXVersion = "1.4.1"
    private const val recyclerviewVersion = "1.2.0"
    private const val legacySupportVersion = "1.0.0"
    private const val vectorDrawableVersion = "1.1.0"
    private const val constraintLayoutVersion = "2.1.3"
    private const val swipeRefreshLayoutVersion = "1.1.0"
    private const val materialVersion = "1.5.0"

    const val core = "androidx.core:core-ktx:$coreXVersion"
    const val appcompat = "androidx.appcompat:appcompat:$appcompatXVersion"
    const val recycler_view = "androidx.recyclerview:recyclerview:$recyclerviewVersion"
    const val legacy_support_v4 = "androidx.legacy:legacy-support-v4:$legacySupportVersion"
    const val vector_drawable = "androidx.vectordrawable:vectordrawable:$vectorDrawableVersion"
    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    const val swipe_refresh_layout =
        "androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshLayoutVersion"
    const val material = "com.google.android.material:material:$materialVersion"
}

object Navigation {
    const val navigationVersion = "2.4.2"

    const val fragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
    const val ui = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
    const val runtime = "androidx.navigation:navigation-runtime-ktx:$navigationVersion"
}

object Composes {
    const val runtime = "androidx.compose.runtime:runtime"
    const val ui = "androidx.compose.ui:ui"
    const val foundation = "androidx.compose.foundation:foundation"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout"
    const val material = "androidx.compose.material:material"
    const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val activityCompose = "androidx.activity:activity-compose:1.6.1"
    const val material3 = "androidx.compose.material3:material3"
    const val materialIcons = "androidx.compose.material:material-icons-extended"
}


object Lifecycle {
    private const val lifecycleVersion = "2.5.1"

    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    const val savestate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
    const val common = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"
}

object Retrofit {
    private const val retrofitVersion = "2.9.0"

    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    const val retrofit_adapter_rxjava3 = "com.squareup.retrofit2:adapter-rxjava3:$retrofitVersion"
}

object OkHttp {
    private const val okHttpVersion = "4.9.3"

    const val okhttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
}

object Hilt {
    const val hiltVersion = "2.41"

    const val android = "com.google.dagger:hilt-android:$hiltVersion"
    const val android_compiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    const val android_testing = "com.google.dagger:hilt-android-testing:$hiltVersion"
    const val android_testing_compiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
}

object ShimmerLayout {
    private const val shimmerLayoutVersion = "0.5.0"

    const val shimmer_layout = "com.facebook.shimmer:shimmer:$shimmerLayoutVersion"
}

object Glide {
    private const val glideVersion = "4.13.0"

    const val glide = "com.github.bumptech.glide:glide:$glideVersion"
    const val glide_compiler = "com.github.bumptech.glide:compiler:$glideVersion"
}

object Timber {
    private const val timberVersion = "5.0.1"

    const val timer = "com.jakewharton.timber:timber:$timberVersion"
}

object ReactiveX {

    private const val reactiveXVersion = "3.0.0"

    const val rx_java_3 = "io.reactivex.rxjava3:rxjava:$reactiveXVersion"
    const val rx_android_3 = "io.reactivex.rxjava3:rxandroid:$reactiveXVersion"
    const val rx_kotlin_3 = "io.reactivex.rxjava3:rxkotlin:$reactiveXVersion"
}

object Junit {
    private const val junitVersion = "4.13.2"

    const val junit = "junit:junit:$junitVersion"
}

object Robolectric {
    private const val robolectricVersion = "4.7.3"

    const val robolectric = "org.robolectric:robolectric:$robolectricVersion"
}

object Mockito {
    private const val mockitoVersion = "4.0.0"

    const val core = "org.mockito:mockito-core:$mockitoVersion"
    const val android = "org.mockito:mockito-android:$mockitoVersion"
    const val inline = "org.mockito:mockito-inline:$mockitoVersion"
    const val kotlin = "org.mockito.kotlin:mockito-kotlin:$mockitoVersion"
}

object MockWebServer {
    private const val mockWebServerVersion = "4.9.3"

    const val mock_web_server = "com.squareup.okhttp3:mockwebserver:$mockWebServerVersion"
}

object Ktlint {
    private const val ktlintVersion = "0.45.2"

    const val ktlint = "com.pinterest:ktlint:$ktlintVersion"
}

object Gson {
    private const val gsonVersion = "2.9.0"

    const val gson = "com.google.code.gson:gson:$gsonVersion"
}

object AndroidArch {
    private const val archVersion = "2.1.0"

    const val core_testing = "androidx.arch.core:core-testing:$archVersion"
}

object AndroidXTest {
    private const val androidXTestVersion = "1.4.0"

    const val core = "androidx.test:core:$androidXTestVersion"
    const val core_ktx = "androidx.test:core-ktx:$androidXTestVersion"
    const val runner = "androidx.test:runner:$androidXTestVersion"
    const val rules = "androidx.test:rules:$androidXTestVersion"

    private const val junitVersion = "1.1.3"

    const val junit = "androidx.test.ext:junit:$junitVersion"
    const val junit_ktx = "androidx.test.ext:junit-ktx:$junitVersion"

    private const val fragmentTestVersion = "1.4.1"
    const val fragment = "androidx.fragment:fragment-testing:$fragmentTestVersion"
}

object Espresso {
    private const val espressoVersion = "3.5.1"

    const val core = "androidx.test.espresso:espresso-core:$espressoVersion"
}