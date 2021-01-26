package pl.wwsis.microblog.model;

import javax.persistence.*;

@Entity
@Table (name="users")
public class Users{

	@Column (name= "userId" , nullable= true )
	private long userId;

	@Column (name= "userName" , nullable= false )
	private String userName;

	@Column (name= "userPass" , nullable= false )
	private String userPass;
}