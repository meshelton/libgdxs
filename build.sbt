lazy val root = (project in file("."))
.settings(
  name := "libgdxs",
  organization := "io.github.meshelton",
  version := "0.1",
  scalaVersion := "2.12.4",
  fork := true,
  scalacOptions ++= Seq("-feature", "-deprecation"),
  resolvers ++= Seq(
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots")
  ),
  libraryDependencies ++= Seq(
    "com.badlogicgames.gdx" % "gdx" % "1.2.0",
    "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.2.0",
    "com.badlogicgames.gdx" % "gdx-platform" % "1.2.0" classifier "natives-desktop",
    "org.scalatest" % "scalatest_2.9.0" % "1.4.1" % "test"
  )
)