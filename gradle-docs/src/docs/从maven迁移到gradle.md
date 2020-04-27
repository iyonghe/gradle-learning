## maven lifecycle VS gradle lifecycle
| maven  | gradle task |
| --- | --- |
| clean | clean  |
| compile |  classes（Java Plugin and other JVM language plugins）  |
| test | test（Java Plugin） |
| package | assemble |
| verify | check |
| install | publishToMavenLocal（Maven Publish Plugin ） |
| deploy | publish（Maven Publish Plugin ） |

## maven scope VS gradle scope
| maven | gradle |
| --- | --- |
| compile | implementation（依赖不传递）<br> api（依赖传递） |
| runtime | runtimeOnly |
| test | testImplementation（测试编译需要）<br> testRuntimeOnly（测试运行时需要）|
| provided | compileOnly |
| import | - |
