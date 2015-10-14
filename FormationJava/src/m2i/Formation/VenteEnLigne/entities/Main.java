package m2i.Formation.VenteEnLigne.entities;


import java.io.IOException;
import java.util.Date;
import m2i.Formation.VenteEnLigne.Repository.*;

public class Main {
	public static void afficher(BookCategory style) { switch(style) 
		{ 
		case Database : System.out.println("Database"); break; 
		case Computer : System.out.println("Computer"); break; 
		case SF : System.out.println("SF"); break; 
		} 
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		
		Authors author = new Authors("toto", "toto", "FR", 2);
		BookRepository bookRepositoy = new BookRepository(); 

		Date dateSortie = new Date(23);
		
		book1.setName("toto");
		try{
			book1.setAuthor(author);
		}catch (MediaException e){
			e.printStackTrace();
		}
		book1.setDateSortie(dateSortie);
		book1.setId(123);
		book1.setCategoryBook(BookCategory.Computer);
		book1.setCategory(MediaCategory.Book);
		
		Media m = new Book();
		m.setPrice(10);
		Basket cart = new Basket(); 
				
		afficher(book1.getCategoryBook());
		System.out.println(m.getVATPrice());
		bookRepositoy.setUri("C:\\Users\\adminlocal\\Desktop\\Book.csv");
		try {
			bookRepositoy.getByTitle("AA");
			System.out.println(bookRepositoy.getByTitle("NN").get(0).getName());
			System.out.println(bookRepositoy.getByTitle("NN").get(0).getReference());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cart.getMedias().addAll(bookRepositoy.getAll());
			System.out.println(cart.getVATPrice());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
