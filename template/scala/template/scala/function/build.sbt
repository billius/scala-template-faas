
ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "com.billius"

lazy val hello = (project in file("."))
  .settings(
    name := "openfaas-template-scala",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"           % "10.0.9",
      "com.typesafe.play" %% "play-json"           % "2.6.9",
      "de.heikoseeberger" %% "akka-http-play-json" % "1.17.0",
      "org.scalatest"     %% "scalatest"           % "3.0.4"  % "test"
    ),
    mainClass in assembly := Some("Main"),
    assemblyJarName in assembly := "handler.jar"
  )
