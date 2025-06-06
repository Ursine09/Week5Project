package project5;


public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		
		asterisk.log("Hello!");
		System.out.println();
		asterisk.error("Error:", "Hello");
		
		spaced.log("Hello");
		spaced.error("ERROR:", "Hello");
		

	}

}
