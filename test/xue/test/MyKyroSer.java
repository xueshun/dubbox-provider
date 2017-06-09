package xue.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.objenesis.strategy.StdInstantiatorStrategy;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import xue.entity.Simple;

/**
 * 使用第三发序列化工具Kyro
 * @author Administrator
 *
 */
public class MyKyroSer {

	
	/**
	 * kryo序列化
	 * @throws FileNotFoundException
	 */
	public static void setSerializableObject() throws FileNotFoundException{
		Kryo kryo = new Kryo();
		kryo.setReferences(false);
		kryo.setRegistrationRequired(false);
		kryo.setInstantiatorStrategy(new StdInstantiatorStrategy());
		kryo.register(Simple.class);
		Output output = new Output(new FileOutputStream("F:/file1.bin"));
		for (int i = 0; i < 100000; i++) {
			Map<String,Integer>map = new HashMap<String,Integer>();
			map.put("zhangsan", i);
			map.put("lisi", i);
			kryo.writeObject(output, new Simple("zhang"+i,(i+1),map));
		}
		output.flush();
		output.clear();
	}
	
	public static void getSerializableObject(){
		Kryo kryo = new Kryo();
		kryo.setReferences(false);
		kryo.setRegistrationRequired(false);
		kryo.setInstantiatorStrategy(new StdInstantiatorStrategy());
		Input input;
		try {
			input = new Input(new FileInputStream("F:/file1.bin"));
			Simple simple = null;
			while((simple = kryo.readObject(input, Simple.class))!=null){
				
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		//setSerializableObject();
		System.out.println("Kryo Serializable writeObject time:" + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		getSerializableObject();
		System.out.println("Kryo Serializable readObject time:" + (System.currentTimeMillis()- startTime) + "ms");
	
	}
}
