import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "io.github.meshelton"
  val buildVersion      = "0.1"
  val buildScalaVersion = "2.11.2"

  val buildSettings = Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion,
    fork := true,
    scalacOptions ++= Seq("-feature", "-deprecation")
  )
}

object Resolvers {
  val sunrepo = "Sun Maven2 Repo" at "http://download.java.net/maven/2"
  val sonatype = "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

  val resolvers = Seq(sunrepo, sonatype)
}

object Dependencies {
  val libgdxVersion = "1.2.0"
  val scalatestVersion = "1.4.1"

  val libgdx = "com.badlogicgames.gdx" % "gdx" % libgdxVersion
  val libgdxLwjgl = "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % libgdxVersion
  val libgdxDesktop = "com.badlogicgames.gdx" % "gdx-platform" % libgdxVersion classifier "natives-desktop"
  val scalatest = "org.scalatest" % "scalatest_2.9.0" % scalatestVersion % "test"
}

object MyBuild extends Build {
  import BuildSettings._
  import Resolvers._
  import Dependencies._

  lazy val libgdxs = Project(
      "libgdxs",
      file("."),
      settings = buildSettings ++ Seq(
          name := "libgdxs",
          libraryDependencies ++= Seq(
              libgdx,
              libgdxLwjgl,
              libgdxDesktop,
              scalatest
            )
        )
    )
}
