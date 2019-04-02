package com.example.springsjy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringsjyApplication {

	public static void main(String[] args) {

//		ApplicationContext fileSystemXmlApplicationContext1 = new FileSystemXmlApplicationContext("/User/shangjinyu/applicationContext.xml");
//		ApplicationContext fileSystemXmlApplicationContext2 = new FileSystemXmlApplicationContext("classpath:/applicationContext.xml");
//		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(com.example.springsjy.StudentConfig.class);
//		ApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//		ApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
		ApplicationContext applicationContext = SpringApplication.run(SpringsjyApplication.class, args);
		//applicationContext.getBean(HomeWork.class).doHomeWork();
	}
}
