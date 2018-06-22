# mousemover
Simple Application to awake your system by moving the mouse unattended. Running this jar on the local machine has no security risks associated. 

## Pre-requisites 
JDK 1.8 or JRE8 Installed on the Machine

## Usage 

Download the JAR from the Maven Artifact or from the Maven Central 


Open your terminal. Change directory to your jar 

```terminal
cd /file/path/to/jar
``` 

Execute the Java Archive

```terminal
$ java -jar RunningMouse-0.0.1-SNAPSHOT.jar
```

You can also provide the delay between the mouse movements in seconds as below.

Every 30 seconds the mouse will move
```terminal
$ java -jar RunningMouse-0.0.1-SNAPSHOT.jar 30
```
