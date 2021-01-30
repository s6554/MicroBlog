package pl.wwsis.microblog.dao;

import pl.wwsis.microblog.model.Users;

public interface UsersDao {
	
	Users getUser(String userName);
	
	void addUser(String userName, String userPass);
}
