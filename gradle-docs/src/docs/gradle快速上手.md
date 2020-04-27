1. 创建`gradle-learning`目录
```
mkdir gradle-learning && cd gradle-learning
```

2. 快速生成项目骨架
```
gradle init
```
```
Starting a Gradle Daemon (subsequent builds will be faster)

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 3

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit 4) [1..4]

Project name (default: gradle-learning):
Source package (default: gradle.learning): com.yonghe

> Task :init
Get more help with your project: https://docs.gradle.org/6.3/userguide/java_library_plugin.html

BUILD SUCCESSFUL in 2m 31s
2 actionable tasks: 2 executed
```

3. 查看生成的项目结构
```
➜  tree .
```
```
.
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── yonghe
    │   │           └── Library.java
    │   └── resources
    └── test
        ├── java
        │   └── com
        │       └── yonghe
        │           └── LibraryTest.java
        └── resources

13 directories, 8 files
```
* settings.gradle: 指定build的项目，包括多module配置
* build.gradle: build的具体配置项，包括插件、依赖等等
* gradle/wrapper: gradle wrapper相关配置

4. 构建项目
```
./gradlew build
```

5. 定义版本号
> build.gradle
```
version = '0.1.0'
```
运行 `jar` task
```
./gradlew jar
```
生成带有版本的jar包: `./build/libs/gradle-learning-0.1.0.jar`

6. 生成javadoc
```
./gradlew javadoc
```
生成javadoc信息: `./build/docs/javadoc`