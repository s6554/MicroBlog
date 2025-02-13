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

	@Column (name= "content" , nullable= false )
	private String content;

	@Column (name= "date" , nullable= false )
	private Date date;

	@Column (name= "title" , nullable= false )
	private String title;

	@Column (name= "userId" , nullable= false )
	private long userId;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
	
}
