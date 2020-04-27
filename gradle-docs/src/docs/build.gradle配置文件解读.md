```
plugins {
    // Apply the java-library plugin to add support for Java Library
    id 'java-library'
}

// 版本号
version = '0.1.0'

repositories {
    // 指定仓库. maven/Ivy/本地file
    jcenter()
}

dependencies {
    // 依赖会传递
    api 'org.apache.commons:commons-math3:3.6.1'

    // 内部使用，依赖不会传递
    implementation 'com.google.guava:guava:28.2-jre'

    // 单元测试时有效
    testImplementation 'junit:junit:4.12'
}
```