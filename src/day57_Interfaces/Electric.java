package day57_Interfaces;

public interface Electric {
	
	public static final boolean HAS_Batteries = true;
	 int Max_Batteries = 100_000;// public static final i can remove this part bc it will automatically be provided by the compailer.
	
	void charge(); // removed public abstract but it is still thereven if I dont see it. 
	
}
