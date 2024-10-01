package assignment;
//import java.util.Scanner;
//public class TestEmployee {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Employee emp=new Employee();
//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter ID");
//		 int empID=sc.nextInt();
//		   emp.setEmpID(empID);
//		System.out.println("enter name of employee");
//		String name=sc.next();
//	     emp.setName(name);
//		System.out.println("enter salary");
//		double salary=sc.nextDouble();
//		 emp.setSalary(salary);
//		System.out.println("Enter no.of hrs work daily");
//		float noOfHrsEmpWork=sc.nextFloat();
//		 emp.setNoOfHrsEmpWork(noOfHrsEmpWork);
//
//System.out.println(emp.getEmpID(1));
//System.out.println(emp.getName("p"));
//System.out.println(emp.getSalary(243244.343));
//System.out.println(emp.getNoOfHrsEmpWork(33));
//	}
//
//}

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.println("Enter ID:");
        int empID = sc.nextInt();
        emp.setEmpID(empID);

        System.out.println("Enter name of employee:");
        String name = sc.next();
        emp.setName(name);

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        emp.setSalary(salary);

        System.out.println("Enter number of hours worked daily:");
        float noOfHrsEmpWork = sc.nextFloat();
        emp.setNoOfHrsEmpWork(noOfHrsEmpWork);

        // Displaying employee information using getters
        System.out.println("Employee ID: " + emp.getEmpID());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Hours worked daily: " + emp.getNoOfHrsEmpWork());
        emp.addSal();
        emp.addWork();

        sc.close(); // Closing the scanner to prevent resource leaks
    }
}

