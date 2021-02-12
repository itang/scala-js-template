enablePlugins(ScalaJSPlugin)
//enablePlugins(JSDependenciesPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "Example"
scalaVersion := "2.13.4"
version := "0.1-SNAPSHOT"

//npm install source-map-support
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "1.1.0",
  "org.querki" %%% "jquery-facade" % "2.0",

  "com.lihaoyi" %%% "utest" % "0.7.7" % "test"
)


//skip in packageJSDependencies := false
//jsDependencies +=
//  "org.webjars" % "jquery" % "3.5.1" / "jquery.js" minified "jquery.min.js"
npmDependencies in Compile ++= Seq(
  "jquery" -> "3.5.1"
)

//webpackBundlingMode := BundlingMode.LibraryOnly()
// https://scalacenter.github.io/scalajs-bundler/cookbook.html#several-entry-points
webpackBundlingMode := BundlingMode.LibraryAndApplication()

//This is an application with a main method
scalaJSUseMainModuleInitializer := true

//npm install jsdom
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
requireJsDomEnv in Test := true

//test
testFrameworks += new TestFramework("utest.runner.Framework")
