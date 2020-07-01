/*
 * Copyright (C) 2020 PatrickKR
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact me on <mailpatrickkr@gmail.com>
 */

lazy val root = (project in file(".")).settings(
  name := "scala-plugin",
  organization := "com.github.patrick-mc",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.13.3"
)

resolvers += "PaperMC Repository" at "https://papermc.io/repo/repository/maven-public/"
libraryDependencies += "com.destroystokyo.paper" % "paper-api" % "1.13.2-R0.1-SNAPSHOT" % "provided"
assemblyJarName in assembly := s"${name.value}-${scalaVersion.value}-dist.jar"