public class ques3{
    public static void  main(String...arg){
       try
        {
            Class.forName("sriyansh");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
}
