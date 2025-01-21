plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "SafeHavenPlugin"

include("HavenCore")
include("Paper_hooks")

include("Haven_1_17_R1")

include("Haven_1_18_R0")
include("Haven_1_18_R1")
include("Haven_1_18_R2")

include("Haven_1_19_R0")
include("Haven_1_19_R1")
include("Haven_1_19_R2")
include("Haven_1_19_R3")
include("Haven_1_19_R4")

include("Haven_1_20_R0")
include("Haven_1_20_R1")
include("Haven_1_20_R2")
include("Haven_1_20_R3")
include("Haven_1_20_R4")
//include("Haven_1_20_R5")
//include("Haven_1_20_R6")

include("Haven_1_21_R0")
include("Haven_1_21_R1")
include("Haven_1_21_R3")
include("Haven_1_21_R4")

project(":Paper_hooks").projectDir = file("HavenCompatibility/Paper_hooks")

project(":Haven_1_17_R1").projectDir = file("HavenCompatibility/Paper_1_17/Haven_1_17_R1")

project(":Haven_1_18_R0").projectDir = file("HavenCompatibility/Paper_1_18/Haven_1_18_R0")
project(":Haven_1_18_R1").projectDir = file("HavenCompatibility/Paper_1_18/Haven_1_18_R1")
project(":Haven_1_18_R2").projectDir = file("HavenCompatibility/Paper_1_18/Haven_1_18_R2")

project(":Haven_1_19_R0").projectDir = file("HavenCompatibility/Paper_1_19/Haven_1_19_R0")
project(":Haven_1_19_R1").projectDir = file("HavenCompatibility/Paper_1_19/Haven_1_19_R1")
project(":Haven_1_19_R2").projectDir = file("HavenCompatibility/Paper_1_19/Haven_1_19_R2")
project(":Haven_1_19_R3").projectDir = file("HavenCompatibility/Paper_1_19/Haven_1_19_R3")
project(":Haven_1_19_R4").projectDir = file("HavenCompatibility/Paper_1_19/Haven_1_19_R4")

project(":Haven_1_20_R0").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R0")
project(":Haven_1_20_R1").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R1")
project(":Haven_1_20_R2").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R2")
project(":Haven_1_20_R3").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R3")
project(":Haven_1_20_R4").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R4")
//project(":Haven_1_20_R5").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R5")
//project(":Haven_1_20_R6").projectDir = file("HavenCompatibility/Paper_1_20/Haven_1_20_R6")

project(":Haven_1_21_R0").projectDir = file("HavenCompatibility/Paper_1_21/Haven_1_21_R0")
project(":Haven_1_21_R1").projectDir = file("HavenCompatibility/Paper_1_21/Haven_1_21_R1")
project(":Haven_1_21_R3").projectDir = file("HavenCompatibility/Paper_1_21/Haven_1_21_R3")
project(":Haven_1_21_R4").projectDir = file("HavenCompatibility/Paper_1_21/Haven_1_21_R4")
