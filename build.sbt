name := "scala"

version := "0.1"

scalaVersion := "2.13.8"

idePackagePrefix := Some("br.com.daian.scala")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.1",
  "org.apache.spark" %% "spark-sql" % "3.2.1"
)