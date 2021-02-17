import java.util.Scanner;

public class ques2 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str_input=sc.next();
        char[] array=str_input.toCharArray();
        char temp;
        for(int i=0; i < array.length; i++) {
            for(int j=0; j < array.length; j++) {
                if(array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("After Sorting: ");
        for (char c : array) {
            System.out.print(c);
        }
    }
}
