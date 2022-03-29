import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacterTest {
    private String testCharacter;
    private RandomCharacter rc = new RandomCharacter();
    private String abcList = "abcdefghijklmnopqrstuvwxyz"; 
    private String digits = "0123456789";

    @RepeatedTest(15)
    public void testLowerCaseLetter() {
        testCharacter = rc.getRandomLowerCaseLetter();
        assertTrue(abcList.indexOf(testCharacter) != -1); // check if the test character is in abclist
    }

    @RepeatedTest(15)
    public void testUpperCaseLetter() {
        testCharacter = rc.getRandomUpperCaseLetter();
        assertTrue(abcList.toUpperCase().indexOf(testCharacter) != -1); //check if the test character is in upper case abclist
    }

    @RepeatedTest(15)
    public void testDigit() {
        testCharacter = rc.getRandomDigitCharacter();
        assertTrue(digits.indexOf(testCharacter) != -1); // check if testCharacter is in digits
    }

    @RepeatedTest(15)
    public void testCharacter() {
        String allCharList = abcList + abcList.toUpperCase() + digits; // concat all the possible values
        testCharacter = rc.getRandomCharacter();
        assertTrue(allCharList.indexOf(testCharacter) != -1);
    }

    @RepeatedTest(15)
    public void testDigitPrime() {
        int testCharacter = Integer.parseInt(rc.getRandomDigitCharacter());
        boolean flag = false; //if it's not a prime, flag will be true
        for (int i = 2; i <= testCharacter/2; i++) {
            if(testCharacter % i == 0) { // check if number is a prime
                flag = true; // set flag to true if number is not prime
                break;
            }
        }
        if (!flag) {
            System.out.println(testCharacter + " is a prime number.");
        }
        else {
            System.out.println(testCharacter + " is not a prime number.");
        }
        assertTrue(!flag);
    }
}
