package assignment2oct;

public class Student {

	    // Data members
	    String name;
	    int age;
	    String address;

	    // Constructor to assign default values
	    public Student() {
	        name = "unknown";
	        age = 0;
	        address = "not available";
	    }

	    // Method 1 to set name and age
	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method 2 to set name, age, and address
	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to display student details
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	    }

	    public static void main(String[] args) {
	        // Create an array of 10 Student objects
	        Student[] students = new Student[10];

	        // Initialize each student object
	        for (int i = 0; i < 10; i++) {
	            students[i] = new Student();  // Default values assigned by constructor
	        }

	        // Set information for the students using setInfo methods
	        students[0].setInfo("John", 20, "123 Street A");
	        students[1].setInfo("Alice", 19, "456 Street B");
	        students[2].setInfo("Bob", 21);
	        students[3].setInfo("Charlie", 22, "789 Street C");
	        students[4].setInfo("David", 20);
	        students[5].setInfo("Emma", 18, "101 Street D");
	        students[6].setInfo("Frank", 23, "202 Street E");
	        students[7].setInfo("Grace", 19);
	        students[8].setInfo("Hannah", 22, "303 Street F");
	        students[9].setInfo("Ivy", 20);

	        // Print the details of all 10 students
	        for (int i = 0; i < 10; i++) {
	            students[i].displayInfo();
	        }
	    }
	}


