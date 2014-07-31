name := "Example"

scalaVersion := "2.11.2"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test"
)

// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

ScalaJSKeys.persistLauncher := true

ScalaJSKeys.persistLauncher in Test := false
