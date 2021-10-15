ThisBuild / version          := "$version$"
ThisBuild / scalaVersion     := "$scala_version$"
ThisBuild / organization     := "com.$organizacion$"  
ThisBuild / organizationName := "$organizacion$"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.7"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )