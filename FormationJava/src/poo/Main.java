package poo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point point = new Point();
//		
//		point.x = 10;
//		point.y = 20;
//		
//		point.afficher();
//		point.deplacer(56, 10);
//		point.afficher();
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.author.firstName = "totofirstname";
		book1.author.lastName = "totolastname";
		book1.author.langue = "fr-FR";
		book1.author.numberOfAuthors = 1;
		book1.dateSortie.setDate(12);
		book1.reference = 123;
		
		book2.author.firstName = "totofirstname";
		book2.author.lastName = "totolastname";
		book2.author.langue = "fr-FR";
		book2.author.numberOfAuthors = 1;
		book2.dateSortie.setDate(12);
		book2.reference = 123;
		
		if (book1 == book2)
			System.out.println("OK !");
		else 
			System.out.println("Deux objets sont forcement differents");
		
	}

}
