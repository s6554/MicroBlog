package pl.wwsis.microblog.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.dao.FollowersDao;
import pl.wwsis.microblog.dao.PostsDao;
import pl.wwsis.microblog.dao.UsersDao;
import pl.wwsis.microblog.model.Posts;
import pl.wwsis.microblog.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)

public class TestMicroblogService {

	@Autowired
	MicroblogService ms;
	
	@Autowired
	PostsDao<Posts, Users> postDao;

	@Autowired
	UsersDao userDao;
	
	@Autowired
	FollowersDao<Users> followerDao;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
