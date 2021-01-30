package WWSIS.Microblog.dao;

import ​static​ org.junit.Assert.​assertFalse;
import ​static​ org.junit.Assert.​assertTrue; 

import org.springframework.test.annotation.Rollback; 
import org.springframework.test.context.ContextConfiguration; 
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import pl.wwsis.microblog.dao.FollowersDao;
import pl.wwsis.microblog.dao.UsersDao;
import pl.wwsis.microblog.model.Followers;
import pl.wwsis.microblog.model.Users;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)

public class testFollowersDao {

	
	@Autowired
	    FollowersDao followerDAO;
	    Followers newFollowee;

	    Followers newFollower;
	    
	    @Before
	    public  void setUp () {
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
	    public boolean isFollowing() {
	    	return FollowersDao.addFollower(newFollowee, newFollower);
	    }


	    @Test
	    public void deleteFollower () {
	    	FollowersDao.removeFollower(newFollowee, newFollower);
	    }
	    
	    @Test
	    public void checkTrackedList () {
	    	FollowersDao.checkTrackedList(newFollowee, newFollower);
	    }
}
