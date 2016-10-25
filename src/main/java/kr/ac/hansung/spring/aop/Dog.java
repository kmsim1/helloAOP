package kr.ac.hansung.spring.aop;
/*
 * Target : 클래스
 * JointPoint : 해당 메소드
 */
public class Dog implements AnimalType {

	private String myName;

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	//JointPoint
	public void sound() {
		System.out.println("Dog name : " + myName + " Bow Wow!!!");
	}

}
