import sbt._

object Dependencies {
  lazy val specs2Core = "org.specs2" %% "specs2-core" % specs2Version

  val specs2Version = "$specs2_version$"
}
