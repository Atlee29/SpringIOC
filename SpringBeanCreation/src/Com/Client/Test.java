package Com.Client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Com.Model.Department;
import Com.Model.Student;

 public class Test {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("Bean.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Student s=(Student) bf.getBean("s");
		s.display();
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Bean.xml","Bean2.xml");
		Student st= a.getBean("s",Student.class);
		Department d = a.getBean("d",Department.class);
		Student s2= a.getBean("s1",Student.class);
		s2.display();
		d.display();
		st.display();
	}

}
