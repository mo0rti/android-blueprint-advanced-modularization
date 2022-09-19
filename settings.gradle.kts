pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "secondhand"
include(":app")
include(":core:datastore")
include(":core:navigation")
include(":core:data")
include(":core:common")
include(":core:model")
include(":core:network")
include(":core:ui")
include(":feature:home")
include(":feature:settings")
include(":feature:favorites")
include(":feature:login")
include(":feature:signup")
include(":feature:splash")
