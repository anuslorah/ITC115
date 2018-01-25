public abstract class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString(){
		return "Name: " + firstName.substring(0,1).toUpperCase() 
				+ firstName.substring(1).toLowerCase() + " " 
				+ lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() 
				+ "\n" + "Email: " + email;
	}
    
}
