package pl.wwsis.microblog.model;

import javax.persistence.*;

public class users {

	@Entity
	@Table (name="users")
	public class User{
		
		@Column (name= "userId" , nullable= true )
		private long userId;
		
		@Column (name= "userName" , nullable= false )
		private String userName;
		
		@Column (name= "userPassword" , nullable= false )
		private String userPassword;
	}
}