package singleton_pattern;

class Singleton {

	private static Singleton _instance;

	private Singleton (){}

	public static Singleton getInstance(){
		if (Singleton._instance == null) {
			Singleton._instance = new Singleton();
		}
    
		return Singleton._instance;
	}

}