# africastalking-java

Official AfricasTalking Java API Wrapper

- This repo is built on JitPack and supports ```gradle```, ```sbt```, ```mvn```, ```leinengen```

### Using gradle

```java
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.AfricasTalkingLtd:africastalking-java:v1.0.0'
}
```


### Using sbt

In your ```build.sbt``` add 

```java
    resolvers += "jitpack" at "https://jitpack.io"
    libraryDependencies += "com.github.AfricasTalkingLtd" % "africastalking-java" % "v1.0.0"

```


### Using maven

In your ```pom.xml``` add repository

```java
  <repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
  </repositories>

```

Step 2: add dependency

```java
  <dependency>
      <groupId>com.github.AfricasTalkingLtd</groupId>
      <artifactId>africastalking-java</artifactId>
      <version>v1.0.0</version>
  </dependency>
```


### Using leiningen

In your ```project.clj``` add

```node
    :repositories [["jitpack" "https://jitpack.io"]]
    :dependencies [[com.github.AfricasTalkingLtd/africastalking-java "v1.0.0"]]
```

