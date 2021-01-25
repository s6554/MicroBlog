package pl.wwsis.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class followers {

	@Entity
	@Table (name="followers")
	public class Followers{
		
		@Column (name= "followerId" , nullable= true )
		private int followerId;
	
		@Column (name= "userId" , nullable= true )
		private int userId;
		
		@Column (name= "follows" , nullable= true )
		private int follows;

	}
	
}
