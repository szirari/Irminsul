package m2i.Formation.VenteEnLigne;

import java.util.Date;


public class Book extends Media{
	private Authors author = new Authors("toto", "toto", "FR", 2);
	private Date dateSortie = new Date();
	private BookCategory categoryBook;
	

	public Authors getAuthor() {
		return author;
	}

	public void setAuthor(Authors author) {
		this.author = author;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public BookCategory getCategoryBook() {
		return categoryBook;
	}

	public void setCategoryBook(BookCategory categoryBook) {
		this.categoryBook = categoryBook;
	}
	@Override
	public double getVATPrice(){
		return getPrice() * 1.05;
	}
}
