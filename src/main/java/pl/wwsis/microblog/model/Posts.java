package pl.wwsis.microblog.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table (name="posts")
public class Posts{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "postId" , nullable= false )
	private long postId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column (name= "content" , nullable= false )
	private String userName;

	@Column (name= "date" , nullable= false )
	private Date date;

	@Column (name= "title" , nullable= false )
	private String title;

	@Column (name= "userId" , nullable= false )
	private long userId;
}
