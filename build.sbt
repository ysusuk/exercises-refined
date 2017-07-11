val scalaExerciesV = "0.4.0-SNAPSHOT"

def dep(artifactId: String) = "org.scala-exercises" %% artifactId % scalaExerciesV

lazy val root = (project in file("."))
  .enablePlugins(ExerciseCompilerPlugin)
  .disablePlugins(CoursierPlugin)
  .settings(
    name := "exercises-refined",
    libraryDependencies ++= Seq(
      dep("exercise-compiler"),
      dep("definitions"),
      %%("shapeless"),
      %%("scalatest"),
      %%("scalacheck"),
      %%("scheckShapeless")
    )
  )


// Distribution

pgpPassphrase := Some(getEnvVar("PGP_PASSPHRASE").getOrElse("").toCharArray)
pgpPublicRing := file(s"$gpgFolder/pubring.gpg")
pgpSecretRing := file(s"$gpgFolder/secring.gpg")
