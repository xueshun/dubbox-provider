package xue.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUtils {
	
	//序列化方法
	public static void writeObject(Serializable s, String fileName){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(s);
			oos.close();
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object readObject(String fileName){
		Object obj = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
			obj = ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
