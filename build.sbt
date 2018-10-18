scalaVersion := "2.12.7"

name := "scalaz-learning"
version := "1.0"

val scalazVersion = "7.2.26"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion
)

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._"
