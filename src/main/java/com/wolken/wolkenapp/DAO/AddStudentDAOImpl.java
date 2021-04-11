package com.wolken.wolkenapp.DAO;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;

import com.wolken.wolkenapp.DTO.ClubDTO;
import com.wolken.wolkenapp.Entity.ClubEntity;
@Controller
public class AddStudentDAOImpl implements AddStudentDAO {
	
Logger logger=Logger.getLogger("AddStudentDAOImpl");
@Autowired
LocalSessionFactoryBean bean;
	@Override
	public String saveStudent(ClubEntity entity) {
		try {
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
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public List<ClubEntity> searchByRole(String role) {
		try {
		logger.info("inside dao");
		SessionFactory factory = bean.getObject();
		logger.info("session factory");
		Session session = factory.openSession();
		logger.info("opensession");
		Transaction transaction = session.beginTransaction();
		logger.info("begin transcation");
		Query query=session.createQuery("select ce from ClubEntity ce where ce.role= :role");
		query.setParameter("role", role);
		List<ClubEntity> dto1=query.list();
		
		return dto1;
	}catch (Exception e) {
		e.printStackTrace();
	}
		return null;
		}

}
