scalaVersion := "2.12.7"

name := "scalaz-learning"
version := "1.0"

val scalazVersion = "7.2.26"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-scalacheck-binding" % "7.2.26-scalacheck-1.14" % "test",
)

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._"

initialCommands in console in Test := "import scalaz._, Scalaz._, scalacheck.ScalazProperties._, scalacheck.ScalazArbitrary._, scalacheck.ScalaCheckBinding._"
