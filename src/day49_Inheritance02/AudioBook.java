package day49_Inheritance02;

public class AudioBook extends Book{
	private double length;
	private String narrator;
	
	public void liste() {
		// listening to Java book by Sawitch and narated by Marufjon
		System.out.println("listening to "+ getTitle()+ " by "+ getAutor()+" and narrated by "+ getNarrator());
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	
}
