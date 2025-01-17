package spartanz.sbtorgpolicies

import sbt._
import Keys._
import de.heikoseeberger.sbtheader.HeaderPlugin
import org.scalafmt.sbt.ScalafmtPlugin

object OrgPoliciesPlugin extends AutoPlugin {

  override def trigger = allRequirements

  override def requires = HeaderPlugin && ScalafmtPlugin

  override def buildSettings =
    Compilation.buildSettings ++
      Publication.buildSettings ++
      Formatting.buildSettings ++
      Seq(
        organization := "org.spartanz",
        organizationName := "Spartanz",
        startYear := Some(2019),
        licenses += ("Apache-2.0", new URL(
          "https://www.apache.org/licenses/LICENSE-2.0.txt"
        ))
      )

  override def projectSettings =
    Compilation.projectSettings
}
