# gradle-learning
gradle学习的示例程序，以及学习文档

## Development
1. 执行[mysql.sql](mysql.sql)
2. 确认[application.properties](gradle-web/src/main/resources/application.properties)文件中数据源配置正确
3. 编译 - `./gradlew clean build`
4. 运行`SpringBootWebApplication.java`启动项目
5. 测试 - `curl 127.0.0.1:8080/users/nick/1`

## Docs
[gradle快速上手](gradle-docs/src/docs/gradle快速上手.md)

[build.gradle配置文件解读](gradle-docs/src/docs/build.gradle配置文件解读.md)

[从maven迁移到gradle](gradle-docs/src/docs/从maven迁移到gradle.md)

[gradle多模块](gradle-docs/src/docs/gradle多模块.md)