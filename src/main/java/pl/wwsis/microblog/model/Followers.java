package pl.wwsis.microblog.model;

import javax.persistence.*;

@Entity
@Table (name="followers")
public class Followers{

	@Column (name= "followerId" , nullable= true )
	private long followerId;

	@Column (name= "userId" , nullable= true )
	private long userId;

	@Column (name= "follows" , nullable= true )
	private long follows;

}
