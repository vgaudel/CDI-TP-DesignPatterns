package commandes;

public class CarteDeCreditStrategy implements IPaiementStrategy {
    
    private String numeroCarte;
    private String cryptogramme;
    private String dateExpiration;

    public CarteDeCreditStrategy(String num, String crypto, String date) {
        this.numeroCarte = num;
        this.cryptogramme = crypto;
        this.dateExpiration = date;
    }

    @Override
    public boolean payer(double montant) {
        System.out.println(montant + "� pay�s par carte de cr�dit.");
        return true;
    }

}