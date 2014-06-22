organization := "io.github.meshelton"

name := "libgdx-scala"

version := "0.1"

scalaVersion := "2.10.4"

resolvers ++= Seq(
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  )

libraryDependencies ++= {
  val libgdxVersion = "1.2.0"
  Seq(
    "com.badlogicgames.gdx" % "gdx" % libgdxVersion,
    "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % libgdxVersion,
    "com.badlogicgames.gdx" % "gdx-platform" % libgdxVersion classifier "natives-desktop"
  )
}
