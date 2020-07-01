lazy val root = (project in file(".")).settings(
  name := "ScalaPlugin",
  organization := "com.github.patrick-mc",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.13.3"
)

resolvers += "PaperMC Repository" at "https://papermc.io/repo/repository/maven-public/"

libraryDependencies += "com.destroystokyo.paper" % "paper-api" % "1.13.2-R0.1-SNAPSHOT" % "provided"