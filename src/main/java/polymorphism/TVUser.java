package polymorphism;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
	//1 . spring  �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
	
	//2. spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
	TV tv = (TV)factory.getBean("tv"); 
	tv.powerOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.powerOff();
	
	//3. spring �����̳ʸ� �����Ѵ�.
	factory.close();
	}
}