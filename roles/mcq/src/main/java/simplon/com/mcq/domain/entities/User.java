package simplon.com.mcq.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "pseudo", nullable = false)
    private String pseudo;

    @Column(name = "is_tutor", nullable = false)
    private boolean tutor;

    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @JoinColumn(name = "role_id", nullable = false)
    @ManyToOne
    private Role role;

    public User() {
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

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    @Override
    public String toString() {
	return "User [firstName=" + firstName + ", lastName=" + lastName + ", pseudo=" + pseudo + ", tutor=" + tutor
		+ ", password=PROTECTED, email=" + userName + "]";
    }

    public boolean isTutor() {
	return tutor;
    }

    public void setTutor(boolean tutor) {
	this.tutor = tutor;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

}
