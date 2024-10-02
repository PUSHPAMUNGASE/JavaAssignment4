package assignment2oct;


	// Base class Person
	public class Person {
	    String name;
	    int age;

	    // Constructor to initialize name and age
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display person details
	    public void displayPersonInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

	// Subclass Employee extends Person
	class Employee extends Person {
	    double salary;

	    // Constructor to initialize name, age, and salary
	    Employee(String name, int age, double salary) {
	        super(name, age); // Calling the constructor of the superclass (Person)
	        this.salary = salary;
	    }

	    // Method to display work details (to be overridden in HRManager)
	    public void work() {
	        System.out.println(name + " is working as an Employee.");
	    }

	    // Method to return salary
	    public double getSalary() {
	        return salary;
	    }
	}

	// Subclass HRManager extends Employee
	class HRManager extends Employee {

	    // Constructor to initialize name, age, and salary
	    HRManager(String name, int age, double salary) {
	        super(name, age, salary); // Calling the constructor of the superclass (Employee)
	    }

	    // Overriding the work method
	    @Override
	    public void work() {
	        System.out.println(name + " is managing HR activities.");
	    }

	    // New method to simulate adding an employee
	    public void addEmployee() {
	        System.out.println(name + " has added a new employee.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating a Person object
	        Person person = new Person("John", 40);
	        person.displayPersonInfo();

	        // Creating an Employee object
	        Employee employee = new Employee("Alice", 30, 50000);
	        employee.displayPersonInfo();
	        employee.work();
	        System.out.println("Salary: " + employee.getSalary());

	        // Creating an HRManager object
	        HRManager hrManager = new HRManager("Bob", 35, 80000);
	        hrManager.displayPersonInfo();
	        hrManager.work(); // Overridden method
	        hrManager.addEmployee(); // New method in HRManager
	        System.out.println("Salary: " + hrManager.getSalary());
	    }
	}


