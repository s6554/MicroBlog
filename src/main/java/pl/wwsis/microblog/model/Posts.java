package pl.wwsis.microblog.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table (name="posts")
public class Posts{

	@Column (name= "postId" , nullable= true )
	private long postId;

	@Column (name= "content" , nullable= false )
	private String userName;

	@Column (name= "date" , nullable= false )
	private Date date;

	@Column (name= "title" , nullable= false )
	private String title;

	@Column (name= "userId" , nullable= true )
	private long userId;
}
