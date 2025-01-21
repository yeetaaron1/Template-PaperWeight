plugins {
  `my-conventions`
  id("io.papermc.paperweight.userdev")
}

dependencies {
  implementation(project(":Paper_hooks"))

  paperweight.paperDevBundle("1.20.6-R0.1-SNAPSHOT")
}
