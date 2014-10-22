package assignment4;



public class Room {

	
	


/**Creating and initializing the room constructor
 * 
 */


	
	String floor = "Carpet";
	int window = 0;
	String paint = "white";

/**Creating the overload contructor
 * 
 */
	
	public Room()
	{
		floor = "Hardwood";
		window = 1;
		paint = "yellow";
	}
	
	public Room(String tempfloor, int tempwindow, String temppaint) {
	    floor = tempfloor;
	    window = tempwindow;
	    paint = temppaint;
	}
	
	public Room(String tempfloor)
	{
	    floor = tempfloor;

	}

	public Room (int tempwindow)
	{
	    window = tempwindow;

	}

	

	/** Creating the set and get methods
	 * 
	 * @param temp
	 */
	   

	    public void setFloor ( String temp ) {
	    	   floor = temp;
	    	} 
	    
	    public void setWindow ( int temp ) {
	    	   window = temp;
	    	} 
	    
	    public void setPaint ( String temp ) {
	    	   paint = temp;
	    	} 
	
	    
	    
	    public int getWindow() {
	    	   return window;
	    	} 
	    
	    public String getFloor() {
	    	   return floor;
	    	} 
	    
	    public String getPaint() {
	    	   return paint;
	    	} 


        /** Creating a toString so objects can be represented textually
         * 
         */
	public String toString() {
		return "Room [Paint = " + paint + "window number: = " + window + "Floor type: = " + floor + "]";
	}	



}
