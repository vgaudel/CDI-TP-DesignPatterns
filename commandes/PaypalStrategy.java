package commandes;

public class PaypalStrategy implements IPaiementStrategy{
    
    private String id;
    private String password;
    
    public PaypalStrategy(String email, String pass){
        this.id=id;
        this.password=pass;
    }
    
    @Override
    public boolean payer(double montant) {
        System.out.println(montant + "€ payés par Paypal.");
        return true;
    }

}