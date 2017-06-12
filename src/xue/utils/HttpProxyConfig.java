package xue.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HttpProxyConfig {
	
	public static int MAX_TOTAL_CONNECTIONS = 800;
	
	public static int MAX_ROUTE_CONNECTIONS = 400;
	
	public static int CONNECT_TIMEOUT = 10000;
	
	public static int READ_TIMEOUT = 10000;

	
	public static int getMAX_TOTAL_CONNECTIONS() {
		return MAX_TOTAL_CONNECTIONS;
	}


	/**
	 * 设置 mAX_TOTAL_CONNECTIONS
	 * 
	 * @param mAX_TOTAL_CONNECTIONS
	 */
	@Value("#{zcparams[max_total_connections]}")
	public static void setMAX_TOTAL_CONNECTIONS(int mAX_TOTAL_CONNECTIONS) {
		MAX_TOTAL_CONNECTIONS = mAX_TOTAL_CONNECTIONS;
	}

	
	/**
	 * 设置 mAX_ROUTE_CONNECTIONS
	 * 
	 * @param mAX_ROUTE_CONNECTIONS
	 */
	@Value("#{zcparams[max_total_connections]}")
	public static void setMAX_ROUTE_CONNECTIONS(int mAX_ROUTE_CONNECTIONS) {
		MAX_ROUTE_CONNECTIONS = mAX_ROUTE_CONNECTIONS;
	}

	/**
	 * 设置 cONNECT_TIMEOUT
	 * 
	 * @param cONNECT_TIMEOUT
	 */
	@Value("#{zcparams[connect_timeout]}")
	public static void setCONNECT_TIMEOUT(int cONNECT_TIMEOUT) {
		CONNECT_TIMEOUT = cONNECT_TIMEOUT;
	}
	
	/**
	 * 设置 rEAD_TIMEOUT
	 * 
	 * @param rEAD_TIMEOUT
	 */
	@Value("#{zcparams[read_timeout]}")
	public static int getREAD_TIMEOUT() {
		return READ_TIMEOUT;
	}

	
	
}
