name := "scalaz-playground"

version := "1.0"

scalaVersion := "2.11.0-M8"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.0-M5"

scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature")

initialCommands in console := """
  import scalaz._
  import Scalaz._
  import std.option._
  import std.list._
"""
