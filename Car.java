package assignment;

public class Car {
private  String carName;
private String  carModel;
private double price;
private  String carOwner;
public Car(String carName, String carModel, double price, String carOwner) {
	super();
	this.carName = carName;
	this.carModel = carModel;
	this.price = price;
	this.carOwner = carOwner;
}

 public void display() {
	System.out.println("car Model :" + carModel);
	System.out.println("Car name :" +carName);
	System.out.println("Car price :"+price);
	System.out.println("Cae owner :"+carOwner);
	
 }

@Override
public String toString() {
	return "Car [carName=" + carName + ", CarModel=" + carModel + ", price=" + price + ", carOwner=" + carOwner + "]";
}

	 
}
