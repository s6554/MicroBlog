package pl.wwsis.microblog.dao;

public interface FollowersDao<S> {
	
	void addFollower(long userId, long followeeId);
	
	void removeFollower(long userId, long followeeId);
	
	boolean checkTrackedList(S loggedUser, S otherUser);
}
