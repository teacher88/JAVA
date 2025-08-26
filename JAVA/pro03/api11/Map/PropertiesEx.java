package api11.Map;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Map - Properties
 */

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws Exception {
		String path=PropertiesEx.class.getResource("data.properties").getPath();  			 // ~.class 위치한 곳에서 가져와라
		path=URLDecoder.decode(path, "UTF-8");													// 한글변환
		
		Properties properties=new Properties();
		properties.load(new FileReader(path));
		String hangul=properties.getProperty("hangul");
		System.out.println(hangul + "\n\n");
		
		Iterator<Object> iter=properties.keySet().iterator();			// 반환형 Object
		while(iter.hasNext()){
			String key=(String) iter.next();
			System.out.println(properties.get(key));
		}
	}
}



