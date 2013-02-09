package hotel;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//import lombok.AccessLevel;
import lombok.Data;
import lombok.AllArgsConstructor;

//@RequiredArgsConstructor
@Data
@AllArgsConstructor
public class Hotel {
	
	private final String name;	
	private String address;	
	private String telephone;
	private int numberOfRooms;
	private int starRating;
	private String manager;		
}

