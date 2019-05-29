package day49_Inheritance02;
			//IS-A 
public class Ebook extends Book{
	private double size;
	private int pages;
	
	public void readEBook(int pageNum) {
		System.out.println("reading "+getTitle()+ " by "+ getAutor()+ " at page "+pageNum);
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
