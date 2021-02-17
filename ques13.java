import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String s) {
        super(s);
    }
}

public class ques13 {
    static void VoteAge(int a) throws AgeException {
        if(a<18)
            throw new AgeException("Sorry, you are not eligible!!!!");
        else
            System.out.println("Welcome, You are eligible for voting.");
    }
    public static void main(String...args) throws AgeException {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your Age: ");
            int input=sc.nextInt();
            VoteAge(input);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
