package com.jwt.dao;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Payment;
import com.jwt.model.Signup;

	@Repository
	public class SignupDAOImpl implements SignupDAO{
		
		@Autowired
		private SessionFactory sessionFactory;

		public void addSignup(Signup signup) {
			sessionFactory.getCurrentSession().saveOrUpdate(signup);

		}

		@SuppressWarnings("unchecked")
		public List<Signup> getAllSignup() {
			return sessionFactory.getCurrentSession().createQuery("from Signup").list();
		}

		public void deleteForm(Integer signupid) {
			Signup signup = (Signup) sessionFactory.getCurrentSession().load(Signup.class, signupid);
			if (null != signup) {
				this.sessionFactory.getCurrentSession().delete(signup);
			}

		}

		public Signup getSignup(int signupid) {
			return (Signup) sessionFactory.getCurrentSession().get(Signup.class, signupid);
		}

		public Signup updateSignup(Signup signup) {
			sessionFactory.getCurrentSession().update(signup);
			return signup;
		}

		public void deleteSignup(Integer signupId) {
			Signup signup = (Signup) sessionFactory.getCurrentSession().load(Signup.class, signupId);
			if (null != signup) {
				this.sessionFactory.getCurrentSession().delete(signup);
			}	
		}


	}
