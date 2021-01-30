package pl.wwsis.microblog.model;

import javax.persistence.*;

@Entity
@Table (name="followers")
public class Followers{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "followerId" , nullable= false )
	public long followerId;

	@Column (name= "userId" , nullable= false )
	public long userId;

	@Column (name= "follows" , nullable= false )
	public long follows;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getFollows() {
		return follows;
	}

	public void setFollows(long follows) {
		this.follows = follows;
	}

}
