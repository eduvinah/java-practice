package day44_Constructors02;

public class WhatsApp {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		System.out.println("no-args constructor");
	}
	public WhatsApp(String toNumber, String message) {
		this();// this will call line #9 that has no arguments first then #12
		System.out.println("2 args - constructor");
		this.toNumber = toNumber;
		this.message = message;
	
		
	}
	public WhatsApp(String toNumber) {
		// toNumber, "[]"
		this(toNumber, "[]");
		System.out.println("1 arg constructor");
	}
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	@Override
	public String toString() {
		return "WatsUpp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	
}
