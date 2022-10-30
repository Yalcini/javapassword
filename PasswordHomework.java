import java.util.Random;

public class PasswordHomework {

    static Random rd = new Random();

    public static String passwordGenerator() {
        int numberDigit = rd.nextInt(48, 57);
        int asciiLetterDigit1 = rd.nextInt(97, 122);
        int asciiLetterDigit2 = rd.nextInt(97, 122);
        int asciiLetterDigit3 = rd.nextInt(97, 122);
        char number = (char) numberDigit;
        char letterDigit1 = (char) asciiLetterDigit1;
        char letterDigit2 = (char) asciiLetterDigit2;
        char letterDigit3 = (char) asciiLetterDigit3;
        char passwordChar[] = { number, letterDigit1, letterDigit2, letterDigit3 };
        String password = new String(passwordChar);
        return password;

    }

    public static void passwordCracker(String password) {
        System.out.println(password);
        String findOut = "";
        outerloop: for (int k = 48; k <= 57; k++) {
            char digit1 = (char) k;
            for (int l = 97; l <= 122; l++) {
                char digit2 = (char) l;
                for (int m = 97; m <= 122; m++) {
                    char digit3 = (char) m;
                    for (int n = 97; n <= 122; n++) {
                        char digit4 = (char) n;

                        char passwordChar[] = { digit1, digit2, digit3, digit4, };
                        String pass = new String(passwordChar);
                        if (pass.equals(password)) {
                            findOut = pass;
                            break outerloop;

                        }

                    }

                }

            }

        }
        System.out.println(findOut);

    }

    public static void main(String[] args) throws Exception {

        passwordCracker(passwordGenerator());
    }
}
