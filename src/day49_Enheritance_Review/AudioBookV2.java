package day49_Enheritance_Review;

public class AudioBookV2 extends BookV2{
	private double length;
	private String narrator;
	
	public double listen() {
		System.out.println("listening to " + getTitle() +" by "+ getAuthor()+" and narrated by "+ narrator);
		return length;
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
