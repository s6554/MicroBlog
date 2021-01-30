package pl.wwsis.microblog.model;

import javax.persistence.*;

@Entity
@Table (name="users")
public class Users{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "userId" , nullable= false )
	public long userId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Column (name= "userName" , nullable= false )
	public String userName;

	@Column (name= "userPass" , nullable= false )
	public String userPass;
}