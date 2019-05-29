package day49_Enheritance_Review;

public class PaperbackV2 extends BookV2{
	private int pages;
	
	public int reading() {
		System.out.println("reading "+ getTitle()+" by "+getAuthor()+" on page "+pages);
		return pages ;
	}
	
	public String toString() {
		return "getTitle() | getAuthor() | getPrice() | getType() | getPages";
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
