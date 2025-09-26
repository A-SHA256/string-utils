import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    protected static final Scanner scanner = new Scanner(System.in);
    protected static Utils utils = new Utils();
    protected static String str;
    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter a string: ");
            if (!scanner.hasNext()) {
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }
            str = scanner.next();
            System.out.println("Reversed string: " + utils.backwards(str));
            System.out.println("Is palindrome? : " + utils.palindrome(str));
            System.out.println("Has that many vowels: " + utils.countVowels(str));
            break;
        }
    }
}