package pl.wwsis.microblog.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface PostsDao<T, S> { //generic types for posts and users
	
	List<T> getUsersTimeline(S user); //returns all posts of specific user
	
	Map<T, S> getUsersFullTimeline(S loggedUser); //returns all posts of logged user and others' that he follows
	
	Map<T, S> getFullPublicTimeline(); //returns all posts of all users
	
	void addPost(String content, Date date, String title, long userId); //adds new post
}
