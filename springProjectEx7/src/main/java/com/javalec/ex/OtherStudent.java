package com.javalec.ex;

public class OtherStudent {

	private String name;
	private int age;

	public OtherStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//@PostConstruct 
	// 메서드를 추가하고 빈이 생성되는 초기화 단계에 어떤 일을 했으면 좋겠단 생각이들때 추가하는 어노테이션.
	public void initMethod() {
		System.out.println("initMethod()");
	}

	//@PreDestory
	// 빈이 소멸될때 메서드안 로직이 수행된다.
	public void destoryMethod() {

	}

}
