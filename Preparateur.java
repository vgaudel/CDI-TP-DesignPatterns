import colis.*;
import commandes.Commande;

public class Preparateur {
	
	private Commande commande;
	private ColisBuilder colisBuilder;
	
	public Preparateur(Commande commande) {
		this.commande = commande;
		setColisBuilder();
	}
	
	public void setColisBuilder() {
		//TODO modifier la fonction pour prendre en compte la fragilité des produits.
		//Créer une fonction getFragilite dans la classe Commande.
		
		/*
		int poidsTotal = this.commande.getPoidsTotal();
		boolean fragile = this.commande.getFragilite();
		
		if (fragile) {
			if (poidsTotal<1000) {setColisBuilder(new ColisMSolidBuilder());}
			else if (poidsTotal> 2500) {setColisBuilder(new ColisXLSolidBuilder());}
			else {setColisBuilder(new ColisLSolidBuilder());}
		} else {
			
			if (poidsTotal<1000) {setColisBuilder(new ColisMFragilBuilder());}
			else if (poidsTotal> 2500) {setColisBuilder(new ColisXLFragilBuilder());}
			else {setColisBuilder(new ColisLFragilBuilder());}
		}*/
	}
	
	public void  setColisBuilder(ColisBuilder colisBuilder) {
		this.colisBuilder= colisBuilder;
	}
	
	public Colis getColis() {
		return colisBuilder.getColis();
	}
	
	
	//Modification de la méthode choisirColis pour qu'elle retourne le colis choisi.
	public Colis choisirColis(){
		colisBuilder.createNewColis();
		colisBuilder.choisirTaille();
		colisBuilder.fragileOuPas();
		colisBuilder.affranchir();
		return colisBuilder.getColis();
	}
}
