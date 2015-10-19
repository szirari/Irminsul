package ExempleSimple;

public class CompteUser {
	private double solde;

	public double getSolde() {
		return solde;
	}
	
	private void setSolde(double solde) {
		this.solde = solde;
	}


	public void debiter (double quantite){
		double newSolde = getSolde() - quantite;
		setSolde(newSolde);
	}
	
	public void crediter (double quantite){
		double newSolde = getSolde() + quantite;		
		setSolde(newSolde);
	}
}
