package commandes;

import java.util.ArrayList;
import articles.Article;
import users.User;

public class Commande {
    
	private User user;
    private ArrayList<Article> panier;
    private IPaiementStrategy moyenPaiement;
    

    public Commande(User user, ArrayList<Article> panier,IPaiementStrategy moyenPaiement) {
       this.user = user;
       this.panier = panier;
       this.moyenPaiement = moyenPaiement;
    }


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public ArrayList<Article> getPanier() {
		return panier;
	}


	public void setPanier(ArrayList<Article> panier) {
		this.panier = panier;
	}


	public IPaiementStrategy getMoyenPaiement() {
		return this.moyenPaiement;
	}


	public void setMoyenPaiement(IPaiementStrategy moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}
	// Ajout des deux getters pour le poids et la fragilité de la commande
	public boolean getFragilite() {
		for (Article a : this.panier) {
			if (a.getFragilite()!="aucune") {return true;}
		}
		return false;
	}
	/*
	public int getPoidsTotal() {
		int poidsTotal=0;
		for (Article a : this.panier) {
			poidsTotal += a.getPoids();
		}
		return poidsTotal;
	}
	
	//Ajout de la méthode getPrix
	public double getPrixTotal() {
		double prixTotal=0;
		for (Article a : this.panier) {
			prixTotal += a.getPrix();
		}
		return prixTotal;
	}*/
	
	@Override
	public String toString() {
		return "Commande : user= "+ this.user.toString()
			  +" \nPanier : "+ this.panier.toString() 
			  +" \nPaiement= "+ this.moyenPaiement.toString();
	}
	
}