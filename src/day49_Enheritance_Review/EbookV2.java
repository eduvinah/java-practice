package day49_Enheritance_Review;
					//IS - A
public class EbookV2 extends BookV2{
	 private int pages;
	 private double Size;
	 
	 public void readEbook(int pageNum) {
		 System.out.println("reading java book by "+ getAuthor()+ " at "+ pageNum);
	 }
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getSize() {
		return Size;
	}
	public void setSize(double size) {
		Size = size;
	}
	 
}
