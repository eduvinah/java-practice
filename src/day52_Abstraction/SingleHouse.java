package day52_Abstraction;

public class SingleHouse extends Building{
	 double hoaFee;
	 
	 public SingleHouse(String name, String type, int floorCount, double hoaFee){
		 super.setName(name);
		 super.setType(type);
		 this.hoaFee = hoaFee;
		toString();
	 }
		 
	 
	 
	 public void addFloor() {
		 System.out.println("adding floor in single house");
	 }
	 public void addDoor() {
		 super.addDoor();
		 System.out.println("adding floor for single house");
	 }
}
