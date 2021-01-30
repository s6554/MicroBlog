package pl.wwsis.microblog.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pl.wwsis.microblog.dao.UsersDao;
import pl.wwsis.microblog.model.Users;

@Transactional
public class UsersDaoImpl implements UsersDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Users getUser(String userName) {
		String sQr = "SELECT u FROM users WHERE u.userName = :userName";
		Query qQr = entityManager.createQuery(sQr);
		Users results = (Users) qQr.getSingleResult();
		return results;
	}

	@Override
	public void addUser(String userName, String userPass) {
		String sQr = "INSER INTO users (userName, userPass) VALUES (:userName, :userPass)";
		Query qQr = entityManager.createQuery(sQr);
		qQr.executeUpdate();
	}

}