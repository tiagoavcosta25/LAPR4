REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=base.server.fluxmotor\target\base.server.fluxmotor-1.3.0-SNAPSHOT.jar;base.server.fluxmotor\target\dependency\*;

REM call the java VM, e.g, 
java -cp %BASE_CP% base.server.fluxmotor.RunServer
