@echo off
SET JAR1=D:\queryToolSingleThread\jsse.jar
SET JAR2=D:\queryToolSingleThread\mail.jar
SET JAR3=D:\queryToolSingleThread\javax.jar
SET JAR4=D:\queryToolSingleThread\activation.jar
SET JAR5=D:\queryToolSingleThread\ojdbc14.jar
SET JAR6=D:\queryToolSingleThread\

SET CMD=E:\Java\j2re-1_4_2_05\bin\java -classpath 
SET CMD=%CMD%%CLASSPATH%
SET CMD=%CMD%;%JAR1%
SET CMD=%CMD%;%JAR2%
SET CMD=%CMD%;%JAR3%
SET CMD=%CMD%;%JAR4%
SET CMD=%CMD%;%JAR5%
SET CMD=%CMD%;%JAR6%
SET CMD=%CMD% com.util.queryToolSingleThread Input.txt

%CMD%
