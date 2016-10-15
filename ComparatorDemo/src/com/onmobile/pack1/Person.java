package com.onmobile.pack1;

public class Person {
	
	private int ssn;
	private String name;
	private int age;
	public Person(int ssn, String name, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	
	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
