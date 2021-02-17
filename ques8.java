import java.util.Scanner;

public class ques8 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.next();
        while (!input.equals("done")) {
            if (input.charAt(0) == input.charAt(input.length() - 1))
                System.out.println("First and last character are equal of: " + input);
             else {
                System.out.println("First and last character are not equals of: " + input);
            }
            input = sc.next();
        }
    }
}