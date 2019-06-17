package OfficeHoursTuesday;

public class UberDriver implements Person{

	@Override
	public String getOccupation() {
		return "Uber Driver";
	}

	@Override
	public String getIncome() {
		return "50";
	}

	@Override
	public String getWork() {
		return "driver";
	}

}
