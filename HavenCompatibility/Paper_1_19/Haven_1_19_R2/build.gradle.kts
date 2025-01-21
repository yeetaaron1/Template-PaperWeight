plugins {
  `my-conventions`
  id("io.papermc.paperweight.userdev")
}

dependencies {
  implementation(project(":Paper_hooks"))

  paperweight.paperDevBundle("1.19.2-R0.1-SNAPSHOT")
}
