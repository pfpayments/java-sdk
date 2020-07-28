lazy val root = (project in file(".")).
  settings(
    organization := "com.postfinancecheckout",
    name := "postfinancecheckout-java-sdk",
    version := "2.2.4",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.17",
      "com.google.api-client" % "google-api-client" % "1.23.0",
      "org.glassfish.jersey.core" % "jersey-common" % "2.29.1",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.10.1" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.10.1" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.1" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.10.1" % "compile",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
