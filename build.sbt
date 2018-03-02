name := "acm-timus-problem-set"

organization := "com.github.taintech"

version := "0.1"

scalaVersion := "2.12.4"

mainClass in (Compile, run) := Some("com.github.taintech.acmtimus.Main")

val scalaTestVersion = "3.0.5"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test
)
