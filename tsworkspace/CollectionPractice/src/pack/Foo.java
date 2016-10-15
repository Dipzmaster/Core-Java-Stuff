package pack;

public class Foo {
	Integer code;

	Foo(Integer c) {
		code = c;
	}

	public boolean equals(Foo f) {
		return false;
	}
	
	public boolean equals(Object f) {
		return true;
	}

	public int hashCode() {
		return 17;
	}

}
