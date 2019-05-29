package day49_Inheritance02;

public class BarnesAndNobles {

	public static void main(String[] args) {
		
		Ebook ebook = new Ebook();
		ebook.setTitle("Introduction to Java Programming");
		ebook.setAutor("Savich");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("tech book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAutor());
		ebook.readEBook(621);
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA preparation");
		aBook.setAutor("Jeanne");
		aBook.setNarrator("Marufjon");
		aBook.liste();
		
		PaperBacks pb = new PaperBacks();
		pb.setAutor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		System.out.println(pb.toString());
	}
}
