import java.util.Scanner;

interface Furniture {
    void stressTest();
    void fireTest();
}
abstract class Chair implements Furniture {
    abstract String chairType();
}
abstract class Table implements Furniture {
    public abstract String tableType();
}
class MetalChair extends Chair {
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }
    public String chairType(){
        return  "This is a metal Chair";
    }
}
class MetalTable extends Table {
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }
    public String tableType() {
        return "This is a metal Table";
    }
}
class WoodenTable extends Table {
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }
    public String tableType() {
        return "This is a wooden Table";
    }
}
class WoodenChair extends Chair {
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }
    public void fireTest() {
        System.out.println("Failed Stress Test");
    }
    public String chairType(){
        return "This is a Wooden Chair";
    }
}
public class ques9 {
    public static void main(String[] args) {
        Table table ;
        Chair chair ;
        Scanner input = new Scanner(System.in);
        System.out.println("Check status of table or chair");
        String str = input.next();
        if (str.equals("table")) {
            System.out.println("wooden or metal");
            String s=input.next();
            if(s.equals("wooden")) {
                table = new WoodenTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            }
            else if(s.equals("metal")){
                table = new MetalTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            }
        }
        else if(str.equals("chair")){
            System.out.println("wooden or metal");
            String s=input.next();
            if(s.equals("wooden")) {
                chair = new WoodenChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();
            }
            else if(s.equals("metal")){
                chair = new MetalChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();
            }
        }
    }
}