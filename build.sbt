name := "Example"

scalaVersion := "2.12.4"

version := "0.1-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true
// scalaJSStage in Global := FullOptStage

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1",
  "io.monix" %% "minitest" % "2.0.0" % "test"
)

jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

testFrameworks += new TestFramework("minitest.runner.Framework")
