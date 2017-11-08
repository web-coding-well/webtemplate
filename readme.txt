/////////////////////////////////////////////////////////////////////////////////////////////////////////
此工程为模板工程，集成以下通用模块：
推荐工程结构，
集成apidoc,
默认启动页，
统一json定义，
在线文档查看，
默认日志设置，
跨域问题处理，
兼容jdk1.7,
集成gson及retrofit,
集成thymeleaf，
html5严格校验处理,
统一异常处理


/////////////////////////////////////////////////////////////////////////////////////////////////////////
注意项：
项目一般需要更改包名，更改包名时类中的package可能不会相应更改，需要手动修改，否则项目可能可以编译，但一执行就会
出现无法预知的错误




//////////////////////////////////////////////////////////////////////////////////////////////////////////
相关知识点：

apidoc:
step1:参照官网安装好node.js环境：http://apidocjs.com/
step2:在根目录下的apidoc.json和apidoc/header.md apidoc/footer.md common.js四个文件可进行相关配置
step3:使用apidoc/generate_apidoc.bat可生成apidoc在线文档
文档存放在src/main/resources/static/apidoc下


devtools生效办法：
step1:IDEA->File->Settings->搜索compiler->打勾 Build project automatically
step2:按下快捷键 Ctrl+shift+Alt+/,选择Registry,打勾compiler.automake.allow.when.app.running
step3:重新启动项目即可看到热部署效果
step4（可选）:使用浏览器插件livereload:http://livereload.com/extensions/


打包命令(也可直接执行package.bat,之后在build/libs下可查看到打包好的jar)：gradle build -x test


调出接口测试REST Client：
step1:按下快捷键 Ctrl+shift+A
step2:搜索rest,选择Load into REST Client


解决端口被占用的问题：
step1:找到端口占用的pid(最后一个)
cmd:netstat -ano|findstr "8089"
step2:根据pid查看进程（比如查到是Tencentdl.exe）
cmd:tasklist|findstr "2656"
step3:强制杀死进程id
cmd:taskkill /F /pid 2656
或者根据查出的进程强制杀死进程
taskkill /f /t /im Tencentdl.exe


kotlin语法中的$问题：
@Value("${'$'}{aa.bb}")
lateinit var  ddd:String
如上，当用kotlin语法时由于$已有特殊用法，因此springboot中要用$必须通过 ${'$'} 获得


IDEA遇到Unsupported major.minor version 52.0问题：
http://blog.csdn.net/huweijian5/article/details/75270742