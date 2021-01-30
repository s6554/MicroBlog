package pl.wwsis.microblog.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)

public class testUsersDao {

	@Autowired
	UsersDao userDAO;

	Users newUser;

	String testUser;

	String testPass;

	@Before
	public void setUp() {
		this.newUser = new Users();
		this.newUser.setUserName("John");
		this.newUser.setUserPass("pass1234");
		
		this.testUser = newUser.getUserName();
	}

	@Test
	public void addUser() {
		userDAO.addUser(newUser.getUserName(), newUser.getUserPass());
	}
	
	@Test
	public Users getUser() {
		return userDAO.getUser(testUser);
	}
}
