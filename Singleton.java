public class Singleton{
    private static Singleton obj=new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return obj;
    }

    public void print(){
        System.out.println("Hello sriyansh!!!");
    }
}  