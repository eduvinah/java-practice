package day52_Abstraction;

public class Building {

	private String name;
	private String type;
	private int floorCount;

	public void addFloor() {
		floorCount++;
		System.out.println("floorcount");
	}

	public void addDoor() {
		System.out.println("aadding door");
	}

	@Override
	public String toString() {
		return "WarmUp [name=" + name + ", type=" + type + ", floorCount=" + floorCount + "]";
	}

	public Building(String string, String string2, int i) {

	}

	public void Building(String name, String type, int floorCount) {
		this.name = name;
		this.type = type;
		this.floorCount = floorCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFloorCount() {
		return floorCount;
	}

}
