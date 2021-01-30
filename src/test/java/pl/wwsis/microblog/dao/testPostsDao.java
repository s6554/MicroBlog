package pl.wwsis.microblog.dao;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.model.Posts;
import pl.wwsis.microblog.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)

public class testPostsDao {

	@Autowired
	PostsDao<Posts, Users> postDao;

	@Autowired
	UsersDao userDao;

	Posts testPost;

	Users user;

	@Before
	public void setUp() {

		this.testPost = new Posts();
		this.testPost.setContent("test");
		this.testPost.setTitle("test");
		this.testPost.setUserId(1);
		this.testPost.setDate(new Date(44000));
		
		this.user = new Users();
		this.user.setUserName("Mirek");
		this.user.setUserPass("haslo123");
	}


	@Test
	public void getUsersTimeline() {
	 postDao.getUsersTimeline(user);
	}



	@Test
	public void checkGetUsersFullTimeline() {
	postDao.getUsersFullTimeline(user);
	}


	@Test
	public void testGetFullPublicTimeline() {
	postDao.getFullPublicTimeline();
	}

	@Test
	public void createPost() {
		postDao.addPost(testPost.getContent(), testPost.getDate(), testPost.getTitle(), testPost.getUserId());
	}
}
