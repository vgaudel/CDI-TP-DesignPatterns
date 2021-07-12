package users;

//import strategy_pattern.PaiementStrategy;

public class PremiumClient implements User {

	private String nom;
	private String prenom;
	private String address;
	
	public PremiumClient(String nom, String prenom, String address) {
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;
	}
	
	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getAddress() {
		return this.address;
	}
	
	@Override
	public String toString() {
		return "Client Premium : Nom= "+ this.getNom()+" Prenom= "+ this.getPrenom()+" Address= "+ this.getAddress();
	}


}
