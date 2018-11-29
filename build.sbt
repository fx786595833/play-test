import sbt.Keys.resolvers

name := "play-test"


inThisBuild(
  Seq(
    version := "1.0",
    scalaVersion := "2.12.2",
    organization := "com.shawnfeng",
    crossPaths := false,
    resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
  )
)

lazy val `jenkinstest` = (project in file(".")).enablePlugins(PlayScala).settings(
  libraryDependencies ++= Seq(
    jdbc, ehcache, ws, specs2 % Test, guice
  ),
  Universal / packageName := "play-test"
)


