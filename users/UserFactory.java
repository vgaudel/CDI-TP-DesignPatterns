package users;

public class UserFactory {
	
	private static UserFactory _instance;
	
	private UserFactory() {
		
	}
	
	public static UserFactory getInstance() {
		if (_instance == null) {_instance = new UserFactory();}
		return _instance;
	}
	
	public User getUser(String type,String nom,String prenom,String address) {
		if("simple".equalsIgnoreCase(type)) return new SimpleClient(nom, prenom, address);
		else if ("premium".equalsIgnoreCase(type)) return new PremiumClient(nom, prenom, address);
			return null;
	}
}
