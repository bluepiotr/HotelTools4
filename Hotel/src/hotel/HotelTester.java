package hotel;

public class HotelTester {
	
	public static void main (String[] args){
		
		//Testing Person
		Person p = new Person("Johny", "jonny", "Mac");
		Person q = new Person("Johny", "jonny", "Macaa");
		if (p.equals(q)){
			System.out.println("Person " + p.getName() + " Person "
					+ q.getName() + " are" + " Equal");
			}
			else {
				System.out.println("These persons are different ");
			}
		
		System.out.println("Person " + p.getName()+ " hashcode= " 
							+ p.hashCode());
		System.out.println("Person " + q.getName()+ " hashcode= " 
				+ q.hashCode());
		
		//Testing Hotel
//				Hotel h = new Hotel ("Cosy Quarters","27 G St", 
//						"0202 2223333",120,3,"Jon Bon");
//				System.out.println("Now created " + h);	
	}
}
