import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int l = string.length();
        PallindromeString pallindromeString = new PallindromeString(string);
        if (pallindromeString.Pallindrome(string, l) == true) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }
}
