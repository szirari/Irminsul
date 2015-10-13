package m2i.Formation.VenteEnLigne;

import java.util.Date;


public class Book extends Media{
	private Authors[] author = new Authors[10];
	private Date dateSortie = new Date();
	private BookCategory categoryBook;
	int nbAuthor = 0;


	public Authors getAuthor() {
		return author[nbAuthor];
	}

	public void setAuthor(Authors author) throws MediaException {
		if (nbAuthor>10){
			throw new MediaException("Trop d'auteurs");
		}
		this.author[nbAuthor] = author;
		nbAuthor++;
		
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
