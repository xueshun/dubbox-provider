package xue.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import xue.entity.Simple;

public class MyJavaSer {
	
	/**
	 * 序列化
	 * @throws Exception
	 */
	public static void setSerializableObject() throws Exception{
		FileOutputStream fo = new FileOutputStream("F:\\file2.bin");
		ObjectOutputStream so = new ObjectOutputStream(fo);
		
		for (int i = 0; i < 100000; i++) {
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("zhangsan0", i);
			map.put("zhangsan1", i);
			so.writeObject(new Simple("zhang"+i,(i+1),map));
		}
		so.flush();
		so.close();
	}
	
	/**
	 * 反序列化
	 */
	public static void getSerializableObject(){
		FileInputStream fi;
		try {
			fi = new FileInputStream("F://file2.bin");
			ObjectInputStream si = new ObjectInputStream(fi);
			
			Simple simple = null;
			while((simple = (Simple)si.readObject())!=null){
				/*System.out.println(simple.getName()+"   " + simple.getName());*/
			}
			fi.close();
			si.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		setSerializableObject();
		System.out.println("java Serializable writeObject time:" +(System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		getSerializableObject();
		System.out.println("java Serializable readObject time:" + (System.currentTimeMillis() - startTime) + "ms");
				
	}
}
