 package poo;

import java.util.Date;

public class Book {
	public String title;
	public Authors author = new Authors();
	public Date dateSortie = new Date();
	public int reference;
	
	public void affiche(){
		System.out.println("Livre ref :" + reference + "titre \"" + title + "\"" + "auteur" + author.getFirstName() + "date de sortie "+ dateSortie);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}


}
