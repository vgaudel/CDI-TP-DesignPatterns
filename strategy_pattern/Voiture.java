package strategy_pattern;

public abstract class Voiture {
    
    private String modele;
	private int prix;
    private String marque;

	public Voiture(String nom, int prix) {
		this.modele = modele;
		this.prix = prix;
        this.marque = marque;
	}

	public String getModele() {
		return this.modele;
	}

	public int getPrix() {
		return this.prix;
	}

	public String getMarque() {
		return this.marque;
	}

	public void payer(PaiementStrategy methode){
		int montant=this.getPrix();
		methode.payer(montant);
	}

}
