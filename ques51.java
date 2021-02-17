class Employee {
    int Employee_id;
    String name;
    public Employee(int Employee_id, String name) {
        this.Employee_id = Employee_id;
        this.name = name;
    }

    Employee(Employee e) {
        Employee_id = e.Employee_id;
        name=e.name;
    }


}

public class ques51 {


        public static void main(String[] args) {
            Employee q1 = new Employee(1234, "Sriyansh");

            Employee q2 = new Employee(q1);

            System.out.println("Employee id: "+q1.Employee_id+" and name: "+q1.name);
            System.out.println("Employee id: "+q2.Employee_id+" and name: "+q2.name);
        }
    }

