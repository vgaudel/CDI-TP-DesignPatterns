//import strategy_pattern.Article;
//import strategy_pattern.CarteDeCreditStrategy;
import java.util.ArrayList;

import articles.Article;
import articles.ArticleFactory;
import colis.*;
import commandes.CarteDeCreditStrategy;
import commandes.Commande;
import users.User;
import users.UserFactory;

// {
    class Main {

        public static void main(String[] args) {
            
             	//Instanciation des deux factories
        	UserFactory uf = UserFactory.getInstance();
        	ArticleFactory af = ArticleFactory.getInstance();
        	
        	
        	//Instanciation des 3 users
    		User user1 = uf.getUser("simple","Jonhson","Marc","Toulouse");
    		User user2 = uf.getUser("premium","Arch","Steeve","Paris");
    		User user3 = uf.getUser("premium","Mcqueen","Bob","Tourcoing");
    		
        	//Affichage des 3 users
    		System.out.println("User1 : " + user1);
    		System.out.println("User2 : " + user2);
    		System.out.println("User3 : " + user3);
    		
        	//Instanciation des 3 articles
            Article article1 = af.getArticle("Livre", "Design Patterns","ref1",24.99,800);
            Article article2 = af.getArticle("BlueRay", "InterStellar","ref2",29.99,125);
            Article article3 = af.getArticle("Vinyle", "Carmen Collector edition","ref3",259.50,200);
        	//Affichage des 3 articles            
    		System.out.println("Article1 : " + article1);
    		System.out.println("Article2 : " + article2);
    		System.out.println("Article3 : " + article3);
    		
    		//Création du panier et ajout des 3 articles
    		ArrayList<Article> panier = new ArrayList<Article>();
    		panier.add(article1);
    		panier.add(article2);
    		panier.add(article3);
    		//Création stratégie de paiement de bob 
    		CarteDeCreditStrategy carteBob = new CarteDeCreditStrategy("4023 4567 4567 7894", "897", "48/89"); 
    		    		
    		Commande commande = new Commande(user3,panier,carteBob);
    		System.out.println(commande.toString());
    		
    		Preparateur stefan =  new Preparateur(commande);
    		
    		/*stefan.setColisBuilder();
    		Colis c = stefan.choisirColis();
    		System.out.println(c.toString());
    		commande.getMoyenPaiement().payer(commande.getPrixTotal()+c.getAffranchissement());
    		 */
        }
}

    
    