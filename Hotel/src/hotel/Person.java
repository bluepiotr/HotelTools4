package hotel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;


@Data
@EqualsAndHashCode (exclude={"address", "telephone", "pwd"})
public class Person {
	@NonNull
	private String name;
	private String address;
	private String telephone;
	@NonNull
	private String userId;
	@NonNull
	private String pwd;
}

