package pack;

public class Person {
	protected int ssn;
	protected String name;

	public Person(int ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
