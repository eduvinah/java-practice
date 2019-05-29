package day49_Inheritance02;

public class PaperBacks extends Book{
	
	private int pages;
	
	public String toString() {
		// tittle, author, price, type, pages. 
		return getTitle() +" | " + getAutor() + " | "+ getPrice() +" | "+ getPages();
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
