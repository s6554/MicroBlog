package pl.wwsis.microblog.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue; 

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.model.Posts;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
 

public class testPostsDao {
	@Autowired
	PostsDao postDAO;
		
	Posts TestPost;
	
	Posts User;
 
	Date DateAdded;
    
    @Before
    public void setUp () {
        
        this.TestPost = new Posts();
        this.TestPost.postId = 1;
        this.TestPost.content = "test";
        this.TestPost.title = "test";
        this.TestPost.userId = 1;
        
        DateAdded = new Date(44000);
        this.TestPost.date= DateAdded;
        
    }
    
    @Test
    public <T> List<T> getUsersTimeline() {
    	return PostsDao.getUsersTimeline(postDAO);
    }

    @Test
    public <T> List<T> getUsersFullTimeline() {
    	return PostsDao.getUsersFullTimeline(postDAO);
    }
    
    @Test
    public <T>  List<T> getFullPublicTimeline() {
    	return PostsDao.getFullPublicTimeline();
    }
    
    @Test
    public void createPost() {
    	PostsDao.addPost("test", DateAdded, "test", 1);
    }
}
