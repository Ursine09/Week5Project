package project5;

public class SpacedLogger implements Logger {

    @Override
    public void log(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            if (i < word.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    @Override
    public void error(String error) {
        error("ERROR", error);
    }

    @Override
    public void error(String label, String word) {
        System.out.print(label + ": ");
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            if (i < word.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}



