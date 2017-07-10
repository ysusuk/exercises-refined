lazy val template = (project in file("."))
    .enablePlugins(ExerciseCompilerPlugin)
    .settings(
      organization := "org.scala-exercises",
      name         := "exercises-template",
      scalaVersion := "2.11.8",
      version := "0.2.2-SNAPSHOT",
      resolvers ++= Seq(
        Resolver.sonatypeRepo("snapshots"),
        Resolver.sonatypeRepo("releases")
      ),
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "2.2.4",
        "org.scala-exercises" %% "exercise-compiler" % version.value,
        "org.scala-exercises" %% "definitions" % version.value,
        "org.scalacheck" %% "scalacheck" % "1.12.5",
        "com.github.alexarchambault" %% "scalacheck-shapeless_1.12" % "0.3.1",
        compilerPlugin("org.spire-math" %% "kind-projector" % "0.7.1")
      )
    )