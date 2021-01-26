package pl.wwsis.microblog.dao;

public interface UsersDao<S> {
	
	S getUser(String userName);
	
	void addUser(String userName, String userPass);
}
