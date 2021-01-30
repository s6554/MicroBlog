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

import pl.wwsis.microblog.dao.UsersDao;
import pl.wwsis.microblog.model.Users;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)


public class testUsersDao {


    @Autowired
    String userDAO; 

    Users newUser;
    
 
    @Before
    public void setUp () {
        this.newUser = new Users();
        this.newUser.userId = 1;
        this.newUser.userName = "John";
        this.newUser.userPass = "pass1234";


    }
    @Test
    public void getUser() {
    	UsersDao.getUser(newUser);
    }
    @Test
    public   void addUser(String,String){
    	return userDAO.addUser("Johnatan", "pass8900");
    }
	
	
	
}