package assignment;

public class Employee {
  float noOfHrsEmpWork;
 double salary;
  String name;
int empID;

public Employee() {
	empID=0;
	name=null;
	noOfHrsEmpWork=0.0f;
	salary=0.0;
	
	
}



public Employee(float noOfHrsEmpWork, double salary, String name, int empID) {
	super();
	this.noOfHrsEmpWork = noOfHrsEmpWork;
	this.salary = salary;
	this.name = name;
	this.empID = empID;
}





public float getNoOfHrsEmpWork() {
	return noOfHrsEmpWork;
}



public void setNoOfHrsEmpWork(float noOfHrsEmpWork) {
	this.noOfHrsEmpWork = noOfHrsEmpWork;
}



public double getSalary() {
	return salary;
}



public void setSalary(double salary) {
	this.salary = salary;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getEmpID() {
	return empID;
}



public void setEmpID(int empID) {
	this.empID = empID;
}

public void addSal() {
	if(salary<500 && noOfHrsEmpWork<6) {
		salary=salary+10;
	System.out.println("salary="+salary+"$");
	}else if(noOfHrsEmpWork>6 && salary<600) {
		salary=salary+15;
	}
	else {
		System.out.println("salary="+salary+"$");
	}
}

public void addWork() {
	if(noOfHrsEmpWork>6 && salary>600) {
		salary=salary+5;
	System.out.println("salary=" + salary+"$");
	}else if(noOfHrsEmpWork>6 && salary<600) {
		salary=salary+15;
	}else
		System.out.println("salary=" +salary+"$");
}



@Override
public String toString() {
	return "Employee [noOfHrsEmpWork=" + noOfHrsEmpWork + ", name=" + name + ", empID=" + empID + "]";
}



	
	
}
