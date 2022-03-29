import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        RandomCharacter rc = new RandomCharacter();

        for (int i = 0; i < 15; i++) {
            System.out.println("Iteration: " + i);
            System.out.println("Random Lower case Letter: " + rc.getRandomLowerCaseLetter());
            System.out.println("Random Upper case Letter: " + rc.getRandomUpperCaseLetter());
            System.out.println("Random Digit Character: " + rc.getRandomDigitCharacter());
            System.out.println("Random Character: " + rc.getRandomCharacter());
            System.out.println();
        }
    }
}
