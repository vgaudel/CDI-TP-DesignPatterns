package articles;

public class ArticleFactory {

	private static ArticleFactory _instance;
	
	private ArticleFactory() {		
	}
	
	public static ArticleFactory getInstance() {
		if (_instance == null) {_instance = new ArticleFactory();} 
		return _instance;
	}
	
	public Article getArticle(String type,String nom, String ref, double prix, int poids) {
		if("Livre".equalsIgnoreCase(type)) return new Livre(nom, ref, prix, poids);
		else if ("BlueRay".equalsIgnoreCase(type)) return new BlueRay(nom, ref, prix, poids);
		else if ("Vinyle".equalsIgnoreCase(type)) return new Vinyle(nom, ref, prix, poids);
			return null;
	}
}
