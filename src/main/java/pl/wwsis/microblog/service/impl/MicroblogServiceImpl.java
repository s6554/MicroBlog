package pl.wwsis.microblog.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.wwsis.microblog.dao.FollowersDao;
import pl.wwsis.microblog.dao.PostsDao;
import pl.wwsis.microblog.dao.UsersDao;
import pl.wwsis.microblog.model.Followers;
import pl.wwsis.microblog.model.Posts;
import pl.wwsis.microblog.model.Users;
import pl.wwsis.microblog.service.TestMicroblogService;

@Service
public class MicroblogServiceImpl implements TestMicroblogService{

	Followers followers = new Followers();
	Posts posts = new Posts();
	Users users = new Users();
	Users otherUser = new Users();
	String userName="";
	
	@Autowired
	FollowersDao<Users> followersDao=null;
	
	@Autowired
	PostsDao<Posts, Users> postsDao=null;
	
	@Autowired
	UsersDao usersDao=null;
	
	
	@Override
	public void addFollower() {
		followersDao.addFollower(followers.getUserId(), followers.getFollows());
	}

	@Override
	public void removeFollower() {
		followersDao.removeFollower(followers.getUserId(), followers.getFollows());
	}

	@Override
	public boolean checkTrackedList() {
		return followersDao.checkTrackedList(users, otherUser);
	}

	@Override
	public List<Posts> getUsersTimeline() {
		return postsDao.getUsersTimeline(users);
	}

	@Override
	public List<Posts> getUsersFullTimeline() {
		return postsDao.getUsersFullTimeline(users);
	}

	@Override
	public List<Posts> getFullPublicTimeline() {
		return postsDao.getFullPublicTimeline();
	}

	@Override
	public void addPost() {
		postsDao.addPost(posts.getContent(), posts.getDate(), posts.getTitle(), posts.getUserId());
	}

	@Override
	public Users getUser() {
		return usersDao.getUser(userName);
	}

	@Override
	public void addUser() {
		usersDao.addUser(users.getUserName(), users.getUserPass());
	}
	
}
