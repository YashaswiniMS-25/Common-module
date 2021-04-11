package com.wolken.wolkenapp.DAO;



import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;

import com.wolken.wolkenapp.DTO.UpdateDTO;
import com.wolken.wolkenapp.Entity.LoginEntity;
import com.wolken.wolkenapp.Entity.UpdateEntity;
import com.wolken.wolkenapp.Entity.UserEntity;
@Controller
public class LoginDAOImpl implements LoginDAO{
	@Autowired
	LocalSessionFactoryBean bean;
	Logger logger=Logger.getLogger("LoginDAOImpl");

	@Override
	public LoginEntity getUserName(String Username) {
		logger.info("inside Login function");
		SessionFactory factory=bean.getObject();
		logger.info("session factory");
		Session session=factory.openSession();
		logger.info("Opensession");
		
		Transaction transaction=session.beginTransaction();
		logger.info("Begin transaction");
		
		Query query=session.createQuery("select ue from LoginEntity ue where UserName=:uname");
		logger.info("create Query");
		query.setParameter("uname", Username);
		LoginEntity entity=(LoginEntity) query.uniqueResult();
		transaction.commit();
		session.close();
		
		return entity;
	}

	@Override
	public UserEntity getByEmailId(String email) {
		try {
			logger.info("inside getbyemailid function");
		SessionFactory factory=bean.getObject();
		logger.info("inside session factory");
		logger.info("session factory");
		
		Session session=factory.openSession();
		logger.info("Opensession");
		
		Transaction transaction=session.beginTransaction();
		logger.info("Begin transaction");
		
		Query query=session.createQuery("select ue from UserEntity ue where EmailId=:email");
		logger.info("create Query");
		query.setParameter("email", email);
		UserEntity entity=(UserEntity) query.uniqueResult();
		transaction.commit();
		session.close();
		
		return entity;
	}catch (Exception e) {
		e.printStackTrace();
		logger.info("exception in logindaoimpl");
	}
		return null;
		
	}

	@Override
	public int updateDetails(UpdateDTO updatedto) {
		SessionFactory factory=bean.getObject();
		logger.info("session factory");
		Session session=factory.openSession();
		logger.info("Opensession");
		
		Transaction transaction=session.beginTransaction();
		logger.info("Begin transaction");
		Query query=session.createQuery("update UserEntity ue set ue.UserName=:uname,ue.Dob=:dob,ue.Gender=:gender,ue.Usn=:usn,ue.Branch=:branch where ue.EmailId=:email");
		query.setParameter("uname", updatedto.getUserName());
		query.setParameter("dob", updatedto.getDob());
		query.setParameter("gender",updatedto.getGender());
		query.setParameter("usn", updatedto.getUsn());
		query.setParameter("branch", updatedto.getBranch());
		query.setParameter("email", updatedto.getEmailId());
		int result=query.executeUpdate();
		
		//UserEntity entity=(UserEntity) query.uniqueResult();
		transaction.commit();
		session.close();
		return result;
	}
	
	

}
