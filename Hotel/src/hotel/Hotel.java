package hotel;

import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

public class Hotel {
	
	@Getter @Setter (AccessLevel.PACKAGE) private String name;	
	@Getter @Setter private String address;	
	@Getter @Setter private String telephone;
	@Getter @Setter private int numberOfRooms;
	@Getter @Setter private int starRating;
	@Getter @Setter private String manager;	
	
	
}

