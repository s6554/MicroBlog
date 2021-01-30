package pl.wwsis.microblog.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import pl.wwsis.microblog.dao.FollowersDao;
import pl.wwsis.microblog.model.Users;

@Transactional
public class FollowersDaoImpl implements FollowersDao<Users>{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addFollower(long userId, long followeeId) {
		String sQr = "INSERT INTO followers (userId, follows) VALUES (:userId, :followeeId)";	
		Query qQr = entityManager.createQuery(sQr);
		qQr.executeUpdate();
	}

	@Override
	public void removeFollower(long userId, long followeeId) {
		String sQr = "DELETE FROM followers WHERE userId = :userId AND follows = :followeeId";	
		Query qQr = entityManager.createQuery(sQr);
		qQr.executeUpdate();
	}

	@Override
	public boolean checkTrackedList(Users loggedUser, Users otherUser) {
		String sQr = "SELECT f FROM followers WHERE f.userId = :loggedUser.getUserId() AND f.follows = :otherUser.getUserId()";	
		Query qQr = entityManager.createQuery(sQr);
		qQr.getResultList();
		return (qQr!=null);
	}
}