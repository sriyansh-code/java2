public class ques5 implements Cloneable{
    int Employee_id;
    String name;

    ques5(int Employee_id, String name) {
        this.Employee_id = Employee_id;
        this.name = name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String... args) {
        try {
            ques5 q = new ques5(1234, "Sriyansh");
            ques5 q1 = (ques5) q.clone();
            System.out.println("Employee id: "+q.Employee_id+" and name: "+q.name);
            System.out.println("Employee id: "+q1.Employee_id+" and name: "+q1.name);
        }
        catch (CloneNotSupportedException e){

        }
    }
}
