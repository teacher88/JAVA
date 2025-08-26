package api11.Map;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Map - Properties
 */

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws Exception {
		String path=PropertiesEx.class.getResource("data.properties").getPath();  			 // ~.class ��ġ�� ������ �����Ͷ�
		path=URLDecoder.decode(path, "UTF-8");													// �ѱۺ�ȯ
		
		Properties properties=new Properties();
		properties.load(new FileReader(path));
		String hangul=properties.getProperty("hangul");
		System.out.println(hangul + "\n\n");
		
		Iterator<Object> iter=properties.keySet().iterator();			// ��ȯ�� Object
		while(iter.hasNext()){
			String key=(String) iter.next();
			System.out.println(properties.get(key));
		}
	}
}



