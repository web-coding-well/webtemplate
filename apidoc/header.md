## 文档说明

* 请求协议：HTTP/1.1
* 返回数据：json字符串
* 字符编码：utf-8

### 接口正常请求时统一按如下格式返回json数据
```
{
	"code":1,//返回码
	"message":"success",//提示信息
	"data":""//实际业务数据，当code=1时data才有意义
}
