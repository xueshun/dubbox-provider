package xue.test;

import xue.entity.User;
import xue.utils.FastJsonConvert;
import xue.utils.HttpProxy;

public class HttpTest1 {
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setId("10001");
		user.setName("李四");
		String responseStr1 = HttpProxy.postJson("http://localhost:8888/provider/userService/postUser", 
				FastJsonConvert.convertObjectToJSON(user));
		System.out.println(responseStr1);
	}
}
