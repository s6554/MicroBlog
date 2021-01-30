package pl.wwsis.microblog.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.model.Followers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)

public class testFollowersDao {

	@SuppressWarnings("rawtypes")
	@Autowired
	FollowersDao followerDao;

	@Autowired
	UsersDao userDao;

	long user;
	long follower;

	Followers newFollowee;

	Followers newFollower;

	@Before
	public void setUp() {
		this.newFollower = new Followers();
		this.newFollower.followerId = 1;
		this.newFollower.userId = 1;
		this.newFollower.follows = 3;

		this.newFollower = new Followers();
		this.newFollower.followerId = 2;
		this.newFollower.userId = 2;
		this.newFollower.follows = 5;

		this.newFollower = new Followers();
		this.newFollower.followerId = 3;
		this.newFollower.userId = 3;
		this.newFollower.follows = 2;
	}

	@Test
	public void isFollowing() {
		followerDao.addFollower(user, follower);
	}

	@Test
	public void deleteFollower() {
		followerDao.removeFollower(user, follower);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void checkTrackedList() {
		followerDao.checkTrackedList(followerDao, followerDao);
	}
}
