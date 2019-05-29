package day43_encapsulation_constructor;

public class TeslaV2 {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(isValidModel(model)) {
		this.model = model;
	}else {
		
		System.out.println("Invalid model");
		this.model = "unknown model";
	}
}
	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	public String toString() {
		return "TeslaV2 [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public boolean isValidModel(String model) {
		model = model.toLowerCase();
		switch (model) {
		case "model 3":

		case "model s":

		case "model y":

		case "readster":
			
		case "model x":

			return true;
		default:
			return false;
		}
		}
		public void setTeslaInfo (String model, int range, double zeroTo60, double price, boolean selfDriving) {
		setModel(model);
		setRange(range);
		setPrice(price);
		setZeroTo60(zeroTo60);
		setSelfDriving(selfDriving);
		
	}
}


