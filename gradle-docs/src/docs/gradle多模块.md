已知： 模块`gradle-web`依赖模块`gradle-business`

1.在`gradle-web`模块中的`build.gradle`加上
```$xslt
dependencies {

    implementation project(':gradle-business')
}
```

2.根目录`settings.gradle`引入模块
```$xslt
rootProject.name = 'gradle-learning'
include 'gradle-docs'
include 'gradle-common'
include 'gradle-web'
include 'gradle-business'
```