package model;

public class Items {

	public String name;
	
	public Items(String name) {
		super();
		this.name = name;
	}

	public Items() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

