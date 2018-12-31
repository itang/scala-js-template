name := "Example"

scalaVersion := "2.12.8"

version := "0.1-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true
// scalaJSStage in Global := FullOptStage

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.querki" %%% "jquery-facade" % "1.2",
  "io.monix" %% "minitest" % "2.0.0" % "test"
)

skip in packageJSDependencies := false

jsDependencies +=
  "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

testFrameworks += new TestFramework("minitest.runner.Framework")
