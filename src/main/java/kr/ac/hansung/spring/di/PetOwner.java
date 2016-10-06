package kr.ac.hansung.spring.di;

import javax.annotation.Resource;

public class PetOwner {
	
	//@Autowired // wiring by type에 의해서 주입이 자동으로 이루어짐 어노테이션.
	//@Qualifier(value="qf_dog") //animal.xml-beans에서 우클릭으로 insert qualifier 필요.
	@Resource(name="dog") // wiring by name에 의해서 이루어짐.
	private AnimalType animal;
	
//생성자를 통해 주입
//	public PetOwner(AnimalType animal) {
//		this.animal = animal;
//	}
	
	public void play() {
		animal.sound();
	}
}
