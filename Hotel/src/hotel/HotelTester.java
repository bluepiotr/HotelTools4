package hotel;

public class HotelTester {
	
	public static void main (String[] args){
		Hotel h = new Hotel ("Cosy Quarters", 120, "Jon Bon");
		System.out.println("hotel " + "'" + h.getName() 
				+ "'" + "has been created");
	}

}
