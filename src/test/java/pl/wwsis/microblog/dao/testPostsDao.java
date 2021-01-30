package pl.wwsis.microblog.dao;

import java.sql.Date;
import java.util.List;

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

	@SuppressWarnings("rawtypes")
	@Autowired
	PostsDao postDao;

	@Autowired
	UsersDao userDao;

	Posts TestPost;

	Users User;

	Date DateAdded;

	@Before
	public void setUp() {

		this.TestPost = new Posts();
		this.TestPost.postId = 1;
		this.TestPost.content = "test";
		this.TestPost.title = "test";
		this.TestPost.userId = 1;

		DateAdded = new Date(44000);
		this.TestPost.date = DateAdded;

	}

	@SuppressWarnings("unchecked")
	@Test
	public <T> List<T> getUsersTimeline() {
		return (List<T>) postDao.getUsersTimeline(userDao);
	}

	@SuppressWarnings("unchecked")
	@Test
	public <T> List<T> getUsersFullTimeline() {
		return (List<T>) postDao.getUsersFullTimeline(userDao);
	}

	@SuppressWarnings("unchecked")
	@Test
	public <T> List<T> getFullPublicTimeline() {
		return (List<T>) postDao.getFullPublicTimeline();
	}

	@Test
	public void createPost() {
		postDao.addPost("test", DateAdded, "test", 1);
	}
}
