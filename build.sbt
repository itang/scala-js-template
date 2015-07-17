name := "Example"

scalaVersion := "2.11.7"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
 "org.monifu" %%% "minitest" % "0.12" % "test"
)

testFrameworks += new TestFramework("minitest.runner.Framework")

// Turn this project into a Scala.js project by importing these settings

enablePlugins(ScalaJSPlugin)

persistLauncher := true

persistLauncher in Test := false
