plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "SafeHavenPlugin"

include("HavenCore")
include("Paper_hooks")
include("Haven_1_17_R1")
include("Haven_1_19_R4")
include("Haven_1_21_R4")

project(":Paper_hooks").projectDir = file("HavenCompatibility/Paper_hooks")
project(":Haven_1_17_R1").projectDir = file("HavenCompatibility/Paper_1_17/Haven_1_17_R1")
project(":Haven_1_19_R4").projectDir = file("HavenCompatibility/Paper_1_19/Haven_1_19_R4")
project(":Haven_1_21_R4").projectDir = file("HavenCompatibility/Paper_1_21/Haven_1_21_R4")
