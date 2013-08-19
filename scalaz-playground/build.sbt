name := "scalaz-playground"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.0-M2"

scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature")

initialCommands in console := """
  import scalaz._
  import Scalaz._
  import std.option._
  import std.list._
"""
