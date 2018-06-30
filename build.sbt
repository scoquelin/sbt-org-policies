organization := "org.scalaz"
name         := "scalaz-sbt"
version      := "0.1-SNAPSHOT"
scalaVersion := "2.12.6"
sbtPlugin    := true

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0")

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}
scriptedBufferLog := false


addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0")
