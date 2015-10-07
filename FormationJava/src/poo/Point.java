package poo;

public class Point {
	public int x;
	public int y;
	
	public void deplacer(int ecartx, int ecarty){
		x += ecartx;
		y += ecarty;
	}
	
	public void afficher(){
		System.out.println("("+x+";"+y+")");
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
