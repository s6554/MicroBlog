package pl.wwsis.microblog.service;

import java.util.List;
import pl.wwsis.microblog.model.Posts;
import pl.wwsis.microblog.model.Users;

public interface MicroblogService {
	
	void addFollower();
	
	void removeFollower();
	
	boolean checkTrackedList();
	
	List<Posts> getUsersTimeline();
	
	List<Posts> getUsersFullTimeline();
	
	List<Posts> getFullPublicTimeline();
	
	void addPost();
	
	Users getUser();
	
	void addUser();
}
