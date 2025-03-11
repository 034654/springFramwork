import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mrLv
 * @date
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext start = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(start);
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		synchronized (new Object()){

		}

	}
	private RestTemplate restTemplate;

}
