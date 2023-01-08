plugins {
     `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("base-plugin") {
            id = "base-plugin"
            implementationClass = "BasePlugin"
        }
    }
}
repositories{
    mavenCentral()
}