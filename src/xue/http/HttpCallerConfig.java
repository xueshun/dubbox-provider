package xue.http;

import java.io.Serializable;
import java.util.Map;

public class HttpCallerConfig implements Serializable {

	/** 默认版本唯一标识**/
	private static final long serialVersionUID = 1L;
	
	/** 默认配置：字符集**/
	public static final String DEFAULT_CONFIG_CHARSET = "UTF-8";
	
	 /** 默认配置：连接超时（毫秒） */
	public static final int DEFAULT_CONFIG_CONN_TIMEOUT = 30000;
	
	/** 默认配置：读取超时（毫秒） */
	public static final int DEFAULT_CONFIT_READ_TIMEOUT = 30000;
	
	/** 默认配置：最大缓冲大小（字符数） */
	public static final int DEFAULT_CONFIG_MAX_BUFFER_SIZE = 500;
	
	 /** URL地址 */
	private String url;
	
	/** 请求方法 */
	private String method;
	
	/** 字符集 */
	private String charset = DEFAULT_CONFIG_CHARSET;
	
	/** 连接超时（毫秒） */
	private int connTimeout = DEFAULT_CONFIG_CONN_TIMEOUT;
	
	/** 读取超时（毫秒） */
	private int readTimeout = DEFAULT_CONFIT_READ_TIMEOUT;
	
	/** 最大缓冲大小（字符数） */
	private int maxBufferSize = DEFAULT_CONFIG_MAX_BUFFER_SIZE;
	
	/** 参数 */
	private Map<String,String> params;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public int getConnTimeout() {
		return connTimeout;
	}

	public void setConnTimeout(int connTimeout) {
		this.connTimeout = connTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public int getMaxBufferSize() {
		return maxBufferSize;
	}

	public void setMaxBufferSize(int maxBufferSize) {
		this.maxBufferSize = maxBufferSize;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "HttpCallerConfig [url=" + url + ", method=" + method + ", charset=" + charset + ", connTimeout="
				+ connTimeout + ", readTimeout=" + readTimeout + ", maxBufferSize=" + maxBufferSize + ", params="
				+ params + "]";
	}	
}
