import java.util.Scanner;

public class ques81 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.next();
        do
        {
            if(input.charAt(0) == input.charAt(input.length() - 1))
                System.out.println("First and last character are equals of: " + input);
            else
                System.out.println("First and last character are NOT equals of: " + input);
            input = sc.next();
        }while(!input.equals("done"));
    }
}
