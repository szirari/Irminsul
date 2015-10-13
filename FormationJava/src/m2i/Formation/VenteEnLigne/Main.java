package m2i.Formation.VenteEnLigne;

import java.util.Date;


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

				
		afficher(book1.getCategoryBook());
		System.out.println(m.getVATPrice());
	}

}
