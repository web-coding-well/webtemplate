/**
 * @apiDefine CODE_200
 * @apiSuccess (Reponse 200) {Number} code 		返回码(1--正常 其他--异常)
 * @apiSuccess (Reponse 200) {String} message 	信息提示
 * @apiSuccess (Reponse 200) {json} [data] 		返回数据
 * @apiSuccessExample {json} Response 200 Example 
 * HTTP/1.1 200 OK 
 * {
 * "code":1, 
 * "message": "success", 
 * "data": ""
 * }
 */