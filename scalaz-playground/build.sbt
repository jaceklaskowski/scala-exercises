name := "scalaz-playground"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.0-M1"

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._, std.option._, std.list._"
