package xue.http;

import java.io.IOException;
import java.util.Map;

/**
 * http协议调用器辅助类
 * @author Administrator
 *
 */
public class HttpCallerUtils {

	private HttpCallerUtils() {
	}

	/**
	 * 默认请求
	 * @param url URL地址
	 * @param params 参数
	 * @return String 文本数据
	 * @throws IOException 
	 */
	public static String request(String url,Map<String,String>params) throws IOException{
		HttpCaller c = new HttpCaller(url,HttpCaller.REQUEST_METHOD_POST,params);
		return c.request();	
	}

	public static String get(String url,Map<String,String>params) throws IOException{
		HttpCaller c = new HttpCaller(url,HttpCaller.REQUEST_METHOD_GET,params);
		return c.request();
	}

	public static String post(String url, Map<String, String> params) throws IOException {
		HttpCaller c = new HttpCaller(url, HttpCaller.REQUEST_METHOD_POST, params);
		return c.request();
	}

	public static String put(String url, Map<String, String> params) throws IOException {
		HttpCaller c = new HttpCaller(url, HttpCaller.REQUEST_METHOD_PUT, params);
		return c.request();
	}
	
	public static String delete(String url, Map<String, String> params) throws IOException {
        HttpCaller c = new HttpCaller(url, HttpCaller.REQUEST_METHOD_DELETE, params);
        return c.request();
    }
}
