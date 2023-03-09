import java.util.Scanner;

class Validation {
    public static void main(String[] args) {

        boolean digitPresent = false;
        boolean specialCharPresent = false;
        boolean upperCasePresent = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");

        String password = sc.nextLine();
        System.out.println("Password is: "+password);
        System.out.println("Is it safe tho?\n");

        int passLength = password.length();
        if(passLength < 8) System.out.println("Bruh, the password is waaaay to short. Get it to 12, at the very least");
        else System.out.println("Password's very long, at a pleasing length");

        char[] chars = password.toCharArray();
        for(char c :chars) {
            if (Character.isDigit(c)) {
                System.out.println("Password contains at least 1 digit... nice");
                digitPresent = true;
                break;
            }
        }
        for(char c :chars) {
            if (Character.isUpperCase(c)) {
                System.out.println("Password contains at least 1 uppercase letter... splendid");
                upperCasePresent = true;
                break;
            }
        }
        for(char c :chars) {
            if (!Character.isAlphabetic(c)) {
                System.out.println("Password contains at least 1 uppercase letter... splendid");
                specialCharPresent = true;
                break;
            }
        }
        if(!digitPresent) System.out.println("No digits? Whack");
        if(!upperCasePresent) System.out.println("No uppercase? Huge L");
        if(!specialCharPresent) System.out.println("No special character? Cringe");
    }
}