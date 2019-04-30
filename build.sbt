
lazy val sbtClojure = (project in file("."))
  .settings(
    name := "sbt-clojure",
    organization := "com.github.terminally-chill",
    scalaVersion := "2.12.8",
    version := "1.0.0-SNAPSHOT",
    sbtPlugin := true
  )
