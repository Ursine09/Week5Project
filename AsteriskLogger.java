package project5;

public class AsteriskLogger implements Logger {
	


	@Override
	public void log(String word) {
		System.out.print("***" + word + "***");
		// TODO Auto-generated method stub
		
}
	@Override
	public void error(String error, String word) {
		System.out.println("\t***************");
		System.out.println("\t***" + error + ":" + word + "***" );
		System.out.println("\t***************");
		
		
	}
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
	}
}