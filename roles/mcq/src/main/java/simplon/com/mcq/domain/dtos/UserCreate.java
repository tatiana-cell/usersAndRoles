package simplon.com.mcq.domain.dtos;

public class UserCreate {

    private String email;
    private String password;
    private String pseudo;
    private String firstName;
    private String lastName;
    private boolean tutor;
    private boolean enabled;

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public boolean isTutor() {
	return tutor;
    }

    public void setTutor(boolean tutor) {
	this.tutor = tutor;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String userName) {
	this.email = userName;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	return "AccountCreate [userName=" + email + ", password=" + password + "]";
    }

}
