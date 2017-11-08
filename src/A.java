
public class A {
	private String name = "";

	public A(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
			A a2 = (A)obj;
			if (name.equalsIgnoreCase(a2.getName()))
				return true;
		}
		return false;
	}
	
}
