name := "plaosan"

version := "0.0.1"

scalaVersion := "2.11.4"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {

  val akkaV = "2.3.7"
  val sprayV = "1.3.2"

  Seq(
    "org.scala-lang.modules"  %%  "scala-parser-combinators"  % "1.0.2",
    "io.spray"                %%  "spray-can"                 % sprayV,
    "io.spray"                %%  "spray-routing"             % sprayV,
    "io.spray"                %%  "spray-testkit"             % sprayV    % "test",
    "com.typesafe.akka"       %%  "akka-actor"                % akkaV,
    "com.typesafe.akka"       %%  "akka-testkit"              % akkaV     % "test",  
    "org.specs2"              %%  "specs2-core"               % "2.4.13"  % "test"
  )

}

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
