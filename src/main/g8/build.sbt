import Dependencies._

organization        := "example"
scalaVersion        := "2.12.2"
version             := "0.1.0-SNAPSHOT"
name                := "scala-seed"
libraryDependencies += scalaTest % Test

lazy val root = (project in file("."))
