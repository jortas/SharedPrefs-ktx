import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object AndroidConstants {
    const val minSdkVersion = 23
    const val targetSdkVersion = 30
    const val compileSdkVersions = 30
    const val buildToolsVersion = "30.0.2"
}

object Versions {
    const val build_gradle_version = "4.1.0-alpha02"
    const val kotlin_gradle_plugin_version = "1.4.0"
    const val bintray_plugin_version = "1.8.5"

    const val bintray_version = "1.8.5"
    const val dokka_version = "1.4.0"

    const val kotlin_stdlib_version = "1.4.0"
    const val androidx_test_runner_version = "1.3.0"
    const val androidx_test_junit_version = "1.1.2"
    const val androidx_test_truth_version = "1.3.0"
    const val gson_version = "2.8.6"
    const val moshi_version = "1.9.3"
    const val timber_version = "4.7.1"
}

object Libs {
    const val com_jfrog_bintray = "com.jfrog.bintray.gradle"
    const val maven_publish = "maven-publish"
    const val org_jetbrains_dokka = "org.jetbrains.dokka"

    const val com_android_tools_build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle_version}"
    const val org_jetbrains_kotlin_kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_gradle_plugin_version}"
    const val com_jfrog_bintray_gradle_bintray_plugin = com_jfrog_bintray + ":gradle-bintray-plugin:${Versions.bintray_plugin_version}"
    const val dokka_gradle_plugin = org_jetbrains_dokka + ":dokka-gradle-plugin:${Versions.dokka_version}"

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_stdlib_version}"
    const val androidx_test_runner = "androidx.test:runner:${Versions.androidx_test_runner_version}"
    const val androidx_test_junit = "androidx.test.ext:junit:${Versions.androidx_test_junit_version}"
    const val androidx_test_truth = "androidx.test.ext:truth:${Versions.androidx_test_truth_version}"
    const val gson = "com.google.code.gson:gson:${Versions.gson_version}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber_version}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi_version}"
}

val PluginDependenciesSpec.mavenPublish: PluginDependencySpec
    inline get() = id(Libs.maven_publish)

val PluginDependenciesSpec.dokka: PluginDependencySpec
    inline get() = id(Libs.org_jetbrains_dokka).version(Versions.dokka_version)

val PluginDependenciesSpec.bintray: PluginDependencySpec
    inline get() = id(Libs.com_jfrog_bintray).version(Versions.bintray_version)