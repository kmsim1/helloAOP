package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		//context가 생성이 되면은 animal.xml에 있는 bean을 생성한다.
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/hansung/spring/di/beans/animal.xml");
		
		PetOwner person = (PetOwner)context.getBean("petOwner");
		person.play();
		
		//마지막에 닫아주어야함.
		context.close();
	}

}
