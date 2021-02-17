public class ques6 {
    public static void main(String...args){
                try{
                    int[] array =new int[5];
                    array[4]=30/0;
                }
                catch(ArithmeticException e){
                    System.out.println("Divisible by zero(ArithmeticException)");
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Warning: ArrayIndexOutOfBoundsException");
                }
                catch(Exception e){
                    System.out.println("Warning: Some Other exception");
                }
                finally {
                    System.out.println("In finally Block");
                }
    }
}


