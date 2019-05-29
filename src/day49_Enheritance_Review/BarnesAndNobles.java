package day49_Enheritance_Review;

public class BarnesAndNobles {

	public static void main(String[] args) {
		
		EbookV2 ebook = new EbookV2();
		
		ebook.setTitle("intro to java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1029);
		ebook.setSize(170);
		ebook.setType("tech book");
		
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPages());
		
		ebook.readEbook(23);
		
		AudioBookV2 abook = new AudioBookV2 ();
		
		abook.setTitle("\"heaven is for real\"");
		abook.setAuthor("Mark");
		abook.setType(" spiritual book");
		abook.setNarrator(" :) Maria");
		
		abook.getAuthor();
		abook.getPrice();
		abook.listen();
		
		PaperbackV2 pb = new PaperbackV2();
		
		pb.setTitle("I died so you can live");
		pb.setAuthor("Jesus");
		pb.setPages(1234);
		pb.setType("spiritual");
		pb.setPrice(30);
		
		pb.getTitle();
		pb.getAuthor();
		pb.getPages();
		pb.getPrice();
		pb.reading();
		
	}

}
