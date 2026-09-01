package seekho.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import seekho.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext(seekho.spring.model.Employee.class);
		
		Employee bean1 = ioc.getBean("employee",Employee.class);
		System.out.println(bean1);
		bean1.setName("Shivam");
		System.out.println(bean1);
		
//		Employee bean2 = ioc.getBean("emp2",Employee.class);
//		System.out.println(bean2);
		

	}

}
