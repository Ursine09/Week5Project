package project5;

public interface Logger {
	
	void log(String word);
	void error(String error);
	void error(String error, String word);
}