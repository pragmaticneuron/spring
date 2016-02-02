package learnspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learn.spring.Student;

@SuppressWarnings("deprecation")
public class TestBean {

	public static void main(String[] args) {

		
		/*Resource resource =  new ClassPathResource("applicationContext.xml");
		BeanFactory factory  = new XmlBeanFactory(resource);
		 
		 Student student = factory.getBean("studentBean", Student.class);
		 student.displayInfo();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student  student = context.getBean("studentBean", Student.class);
		
		student.displayInfo();
	}

}
