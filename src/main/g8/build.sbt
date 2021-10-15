ThisBuild / version          := "$version$"
ThisBuild / scalaVersion     := "$scala_version$"
ThisBuild / organization     := "com.$organizacion$"  
ThisBuild / organizationName := "$organizacion$"

lazy val root = (project in file("."))
  .settings(
    name := "$name$"
  )