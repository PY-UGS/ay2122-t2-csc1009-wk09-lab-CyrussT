import java.util.Random;

public class RandomCharacter {
    Random r = new Random();

    private char getRandomLetter() {
        return (char)(r.nextInt(26) + 'a'); // Check if within ascii of 'a' to 'z'
    }

    public String getRandomLowerCaseLetter() {
        return Character.toString(getRandomLetter()); 
    }

    public String getRandomUpperCaseLetter() {
        return Character.toString((char)(getRandomLetter()-32)); // calls getRandomLetter then minus 32 to get the ascii value of the uppercase character
    }

    public String getRandomDigitCharacter() {
        return Integer.toString(r.nextInt(0,10)); // random number between 0 to 9 (inclusive)
    }

    public String getRandomCharacter() {
        int choice = r.nextInt(0,3); // get a random number between 0 and 2 (inclusive), if 0, return lower case letter, if 1, return upper case letter, if 2, return random digit
        switch (choice) {
            case 0:
                return getRandomLowerCaseLetter();
            case 1:
                return getRandomUpperCaseLetter();
            case 2:
                return getRandomDigitCharacter();
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

}