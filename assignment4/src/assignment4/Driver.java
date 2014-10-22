package assignment4;

public class Driver {		
  	// Main method when other methods will be executed
	public static void main(String[] args) {
		
		Room a = new Room();
		Room b = new Room("Tiled", 0, "Purple");
		Room c = new Room();
		
		
		/**Setting Room c to white paint, 3 windows and carpeted floor.
		 */
		 
		c.setPaint("white");
		c.setWindow(3);
		c.setFloor("Carpeted");

		//Printing out Room a, b and c
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		 
		 
	}

}
