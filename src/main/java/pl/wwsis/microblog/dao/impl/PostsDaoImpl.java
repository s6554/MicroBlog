package pl.wwsis.microblog.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pl.wwsis.microblog.dao.PostsDao;
import pl.wwsis.microblog.model.Posts;
import pl.wwsis.microblog.model.Users;

@Transactional
public class PostsDaoImpl implements PostsDao<Posts, Users>{

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Posts> getUsersTimeline(Users user) {
		String sQr = "SELECT * FROM posts WHERE posts.userId = :user.userId";
		Query qQr = entityManager.createQuery(sQr);
		List<Posts> results = qQr.getResultList();
		return results;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Posts> getUsersFullTimeline(Users loggedUser) {
		String sQr = "SELECT p FROM posts FULL OUTER JOIN users ON p.userId = u.userId WHERE u.userId = :loggedUser OR u.userId = (SELECT f.follows FROM followers WHERE f.userId = :loggedUser)";
		Query qQr = entityManager.createQuery(sQr);
		List<Posts> results = qQr.getResultList();
		return results;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Posts> getFullPublicTimeline() {
		String sQr = "SELECT p FROM posts FULL OUTER JOIN users ON p.userId = u.userId";
		Query qQr = entityManager.createQuery(sQr);
		List<Posts> results = qQr.getResultList();
		return results;
	}

	public void addPost(String content, Date date, String title, long userId) {
		String sQr = "INSER INTO posts (content, date, title, userId) VALUES (:content, :date, :title, :userId)";
		Query qQr = entityManager.createQuery(sQr);
		qQr.executeUpdate();
	}
	
	
}