
import java.util.*;

class Customer {​​​​​​
    int cust_id;
    String name;

    Scanner scObj = new Scanner(System.in);
    Customer() {​​​​​​
        System.out.println("this is constructor of Customer");
        cust_id = 101;
        name = "Prasunamba";
    }​​​​​​
    void acceptDetails() {​​​​​​
        System.out.println("accept details method called");
        System.out.println("enter your customer id ");
        cust_id = scObj.nextInt();
        System.out.println("enter customer name ");
        name = scObj.next();
        System.out.println("customer deatils accepted");
    }​​​​​​
    void displayDetails() {​​​​​​
        System.out.println("display details method called");
        System.out.println(" customer id = "+ cust_id + " customer name "+ name);
    }​​​​​​
}​​​​​​

class Employee {​​​​​​
    int sal;
    String eName;
    Scanner sc = new Scanner(System.in);
      Employee() {​​​​​​
        System.out.println("********    employee constructor is called *****");
        sal = 0;
        eName = "A";
    }​​​​​​
    void empAcceptDetails() {​​​​​​
        System.out.println("employee accept details method called");
        System.out.println("enter employee salary");
        sal = sc.nextInt();
        System.out.println("enter employee name");
        eName = sc.next();
        System.out.println("employee details Accepted");
    }​​​​​​
    void empDisplayDetails() {​​​​​​
        System.out.println("employee name " + eName + " salary is " + sal);
    }​​​​​​
}​​​​​​
public class ExecuteClass2 {​​​​​​
    public static void main(String[] args) {​​​​​​
        Customer custObj = new Customer();
        custObj.acceptDetails();
        custObj.displayDetails();

        Employee empObj ;
        empObj= new Employee();
        empObj.empAcceptDetails();
        empObj.empDisplayDetails();
    }​​​​​​
}​​​​​​


