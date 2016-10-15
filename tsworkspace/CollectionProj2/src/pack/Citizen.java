package pack;

public class Citizen extends Person {
	private String country;
	private int income;
	private int age;

	public Citizen(int ssn, String name, String country, int income, int age) {
		super(ssn, name);
		this.country = country;
		this.income = income;
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
