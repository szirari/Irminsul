 package poo;

import java.util.Date;

public class Book {
	public String title;
	public Authors author = new Authors();
	public Date dateSortie = new Date();
	public int reference;
	public int test;
	
	public void affiche(){
		System.out.println("Livre ref :" + reference + "titre \"" + title + "\"" + "auteur" + author.getFirstName() + "date de sortie "+ dateSortie);
	}
	
	public String getTitle(){
		return title;
	}
	
	public Authors getAuthor(){
		return author;
	}
	
	public Date getDate(){
		return dateSortie;
	}
	
	public int getReference(){
		return reference;
	}
	
	public void setTitle(String newTitle){
		title = newTitle;
	}
	
	public void setAuthor(Authors newAthor){
		author = newAthor;
	}
	
	public void setDate(Date newDate){
		dateSortie = newDate;
	}
	
	public void setReference(int newReference){
		reference = newReference;
	}
}
