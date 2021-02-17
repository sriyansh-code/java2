import java.util.Scanner;

public class ques7 {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int input = sc.nextInt();
        int day = input/86400;
        int hours = (input%86400)/3600;
        int min = ((input%86400)%3600) /60;
        int sec =(((input%86400)%3600)%60);
        System.out.println();
        System.out.print(day+ " day(s),"+hours+"  hour(s), "+min+"  minute(s), and "+sec+" second(s). ");
    }
}
