

public class User {

	private String lastName;
	private String firstName;
	private String phone;
	private String address;

	// public User(String lastName, String firstName, String phone, String address){
	// 	this.lastName = lastName;
	// 	this.firstName = firstName;
	// 	this.phone = phone;
	// 	this.address = address;
	// }

	public static class UserBuilder{
		private String lastName;
		private String firstName;
		private String phone;
		private String address;

		public UserBuilder withLastName(String lastName){
			this.lastName = lastName;
			return this;
		}

		public UserBuilder withFirstName(String firstName){
			this.firstName = firstName;
			return this;
		}

		public UserBuilder withPhone(String phone){
			this.phone = phone;
			return this;
		}

		public UserBuilder withAddress(String address){
			this.address = address;
			return this;
		}

		public User build(){
			User user = new User();
			user.firstName = firstName;
			user.lastName = lastName;
			user.address = address;
			user.phone = phone;
			return user;
		}
	}

	public String getLastName(){
		return lastName;
	}

	public String getFirstName(){
		return firstName;
	}
}
