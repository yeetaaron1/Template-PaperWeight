plugins {
  `my-conventions`
  id("io.papermc.paperweight.userdev")
}

dependencies {
  implementation(project(":Paper_hooks"))

  paperweight.paperDevBundle("1.20.4-R0.1-SNAPSHOT")
}

tasks.withType<JavaCompile>().configureEach {
  // Override release for newer MC
  options.release = 17
}
