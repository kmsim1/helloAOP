package kr.ac.hansung.spring.di;
/*
 * 루즈 커플링을 위한
 * Dependency Injection 두가지 방법
 * 1. Setter를 통해서
 * 2. Constructor를 통해서
 */
public class Dog implements AnimalType {

	private String myName;

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void sound() {
		System.out.println("Dog name : " + myName + " Bow Wow!!!");
	}

}
