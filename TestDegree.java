package assignment2oct;

public class TestDegree {

	    public static void main(String[] args) {
	        // Creating objects of each class
	        Degree degree = new Degree();
	        Undergraduate ug = new Undergraduate();
	        Postgraduate pg = new Postgraduate();

	        // Calling the method from each object
	        degree.getDegree();       // Calls method from Degree class
	        ug.getDegree();           // Calls overridden method from Undergraduate class
	        pg.getDegree();           // Calls overridden method from Postgraduate class
	    }
	}


