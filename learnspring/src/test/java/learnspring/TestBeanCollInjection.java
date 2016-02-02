package learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.collectioninjections.Question;
import com.learn.spring.injections.Student;


@SuppressWarnings("deprecation")
public class TestBeanCollInjection {

	public static void main(String[] args) {

		
		/*Resource resource =  new ClassPathResource("applicationContext.xml");
		BeanFactory factory  = new XmlBeanFactory(resource);
		 
		 Student student = factory.getBean("studentBean", Student.class);
		 student.displayInfo();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextCollinject.xml");
		
		Question  question = context.getBean("question", Question.class);
		
		question.displayInfo();
	}

}
