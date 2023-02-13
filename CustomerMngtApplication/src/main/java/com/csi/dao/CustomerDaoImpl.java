package com.csi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.csi.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public void signUp(Customer customer) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(customer);
		transaction.commit();

	}

	@Override
	public boolean signIn(String custEmailId, String custPassword) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Customer> customers = session.createQuery("from Customer").list();
		boolean flag = false;
		for (Customer customer : customers) {
			if (customer.getCustEmailId().equals(custEmailId) && customer.getCustPassword().equals(custPassword)) {
				flag = true;
			}
		}

		return flag;
	}

	@Override
	public List<Customer> getAllData() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		return session.createQuery("from Customer").list();
	}

}
