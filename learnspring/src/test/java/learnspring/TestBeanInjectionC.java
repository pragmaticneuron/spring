package learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.injections.Address;
import com.learn.spring.injections.Student;
import com.learn.spring.injections.Teacher;


@SuppressWarnings("deprecation")
public class TestBeanInjectionC {

	public static void main(String[] args) {

		
		/*Resource resource =  new ClassPathResource("applicationContext.xml");
		BeanFactory factory  = new XmlBeanFactory(resource);
		 
		 Student student = factory.getBean("studentBean", Student.class);
		 student.displayInfo();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextInject.xml");
		
		Student  student = context.getBean("studentBean", Student.class);
		
		Teacher teacher = context.getBean("teacherBean", Teacher.class);
		
		Address  address = context.getBean("address", Address.class);
		
		
		
		student.displayInfo();
		
		System.out.println(student.getAddress().hashCode());
		
		
		teacher.displayInfo();
		
		System.out.println(teacher.getAddress().hashCode());

		
		student.displayInfo();
		
		System.out.println(student.getAddress().hashCode());
		
		
		teacher.displayInfo();
		
		System.out.println(teacher.getAddress().hashCode());
	}

}
