import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        RandomCharacter rc = new RandomCharacter();

        for (int i = 0; i < 15; i++) {
            System.out.println(rc.getRandomLowerCaseLetter());
            System.out.println(rc.getRandomUpperCaseLetter());
            System.out.println(rc.getRandomDigitCharacter());
            System.out.println(rc.getRandomCharacter());
        }
    }
}
