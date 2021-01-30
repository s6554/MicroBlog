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
import pl.wwsis.microblog.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)

public class testFollowersDao {

	@Autowired
	FollowersDao<Users> followerDao;

	@Autowired
	UsersDao userDao;

	long user;
	long follower;

	Followers newFollowee;

	Followers newFollower1, newFollower2, newFollower3;

	@Before
	public void setUp() {
		this.newFollower1 = new Followers();
		this.newFollower1.setUserId(1);
		this.newFollower1.setFollows(3);

		this.newFollower2 = new Followers();
		this.newFollower2.setUserId(2);
		this.newFollower2.setFollows(5);

		this.newFollower3 = new Followers();
		this.newFollower3.setUserId(3);
		this.newFollower3.setFollows(2);
		
		this.user = 1;
		this.follower = 3;
	}

	@Test
	public void isFollowing() {
		followerDao.addFollower(user, follower);
	}

	@Test
	public void deleteFollower() {
		followerDao.removeFollower(user, follower);
	}

	@Test
	public void checkTrackedList() {
		followerDao.checkTrackedList(userDao.getUser("John"), userDao.getUser("Johny"));
	}
}
