package xue.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * FastJSON 与 JavaBean 相互装换类
 * @author Administrator
 *
 */
public class FastJsonConvert {
	
	private static final SerializerFeature[] featuresWithNullValue = {
			SerializerFeature.WriteMapNullValue,
			SerializerFeature.WriteNullBooleanAsFalse,
			SerializerFeature.WriteNullListAsEmpty,
			SerializerFeature.WriteNullNumberAsZero,
			SerializerFeature.WriteNullStringAsEmpty};
	
	/**
	 * JSONString 转换  Object
	 * @param data
	 * @param clzss
	 * @return
	 */
	public static<T> T convertJSONToObject(String data, Class<T> clzss){
		try {
			T t = JSON.parseObject(data, clzss);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Object to  List<Object>
	 * @param data
	 * @param clzss
	 * @return
	 */
	public static<T> List<T> convertJSONToArray(String data, Class<T> clzss){
		try {
			List<T> t = JSON.parseArray(data, clzss);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Object to JsonString
	 * @param obj
	 * @return
	 */
	public static String convertObjectToJSON(Object obj){
		try {
			String text = JSON.toJSONString(obj);
			System.out.println(text);
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	/**
	 * Object to JSONString
	 * @param obj
	 * @return
	 */
	public static String convertObjectToJSONWithNullValue(Object obj){
		try {
			String text = JSON.toJSONString(obj, featuresWithNullValue);
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.err.println(FastJsonConvert.convertObjectToJSONWithNullValue(System.getProperties()));
	}
}
