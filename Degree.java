package assignment2oct;

public class Degree {

	
	    // Method in the parent class
	    public void getDegree() {
	        System.out.println("I got a degree");
	    }
	}

	class Undergraduate extends Degree {
	    // Overriding method in the subclass
	    @Override
	    public void getDegree() {
	        System.out.println("I am an Undergraduate");
	    }
	}

	class Postgraduate extends Degree {
	    // Overriding method in the subclass
	    @Override
	    public void getDegree() {
	        System.out.println("I am a Postgraduate");
	    }
	}

	
	
	

