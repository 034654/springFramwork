import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mrLv
 * @date
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext start = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(start);
	}
}
