scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

addSbtPlugin("com.jsuereth"        % "sbt-pgp"               % "1.1.2")
addSbtPlugin("com.github.gseitz"   % "sbt-release"           % "1.0.11")
addSbtPlugin("com.eed3si9n"        % "sbt-unidoc"            % "0.4.2")
addSbtPlugin("com.eed3si9n"        % "sbt-buildinfo"         % "0.9.0")
addSbtPlugin("pl.project13.scala"  % "sbt-jmh"               % "0.3.7")
addSbtPlugin("org.scoverage"       % "sbt-scoverage"         % "1.6.0")
addSbtPlugin("org.scalastyle"     %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("com.typesafe.sbt"    % "sbt-git"               % "1.0.0")
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"          % "2.4")
addSbtPlugin("org.scala-js"        % "sbt-scalajs"           % "0.6.28")
addSbtPlugin("org.tpolecat"        % "tut-plugin"            % "0.6.12")
addSbtPlugin("net.virtual-void"    % "sbt-dependency-graph"  % "0.9.2")
addSbtPlugin("org.portable-scala"  % "sbt-scalajs-crossproject" % "0.6.0")
addSbtPlugin("com.47deg"           % "sbt-microsites"        % "0.7.27")
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.26"
