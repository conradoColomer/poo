package singleton;

public class Browser {
	// ref; https://www.youtube.com/watch?v=khnair65cVc 
	// 1. private static instance for the Class 
	private volatile static Browser browser;
	
	// 2. private constructor to avoid objects/instantiation
	private Browser(){
		
	}
	// 3. public static method to provide access to the instance or the class 
	public static Browser getInstance() {
		if (browser == null) {
			synchronized (Browser.class) {
				if (browser == null) {
					browser = new Browser();
				}
			}
		}
				
		return browser; 
	} 
	
	// 4. individual public method of the Class 
	public void displayMesg(String msj) {
		System.out.println(msj);
	}

}
