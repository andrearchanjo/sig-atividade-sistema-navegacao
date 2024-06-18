pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://esri.jfrog.io/artifactory/arcgis")
        }
    }
}

rootProject.name = "AtividadeSistemaNavegacao"
include(":app")