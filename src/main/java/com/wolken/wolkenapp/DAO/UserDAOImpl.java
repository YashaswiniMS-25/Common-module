package com.wolken.wolkenapp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.DTO.UserDTO;
import com.wolken.wolkenapp.Entity.UserEntity;
import com.wolken.wolkenapp.Exception.User2Exception;
import com.wolken.wolkenapp.Exception.UserException;

@Component

public class UserDAOImpl implements UserDAO {
	Logger logger = Logger.getLogger("UserDAOImpl");

	@Autowired
	LocalSessionFactoryBean bean;

	public String save(UserEntity entity) throws UserException {
		logger.info("inside dao");
		SessionFactory factory = bean.getObject();
		logger.info("session factory");
		Session session = factory.openSession();
		logger.info("opensession");
		Transaction transaction = session.beginTransaction();
		logger.info("begin transcation");
		session.save(entity);
		logger.info("saved....");
		transaction.commit();
		session.close();

		return "data added";
	}

	@Override
	public UserEntity getByEmailId(String email) {
		// TODO Auto-generated method stub
		logger.info("inside getByEmailId");
		SessionFactory factory = bean.getObject();
		logger.info("session factory");
		Session session = factory.openSession();
		logger.info("opensession");
		Transaction transaction = session.beginTransaction();
		logger.info("begin transcation");
		Query query = session.createQuery("select ue from  UserEntity ue where EmailId=:email");
		query.setParameter("email", email);
		logger.info("setting parameters");
		UserEntity entity = (UserEntity) query.uniqueResult();
	
		// query.executeUpdate();
		transaction.commit();
		session.close();

		return entity;
	}

}
