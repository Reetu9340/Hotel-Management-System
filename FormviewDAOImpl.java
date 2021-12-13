package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jwt.model.Formview;

	@Repository
	public class FormviewDAOImpl implements FormviewDAO {

		@Autowired
		private SessionFactory sessionFactory;

		public void addFormview(Formview formview) {
			sessionFactory.getCurrentSession().saveOrUpdate(formview);

		}

		@SuppressWarnings("unchecked")
		public List<Formview> getAllFormview() {
			return sessionFactory.getCurrentSession().createQuery("from Formview").list();
		}

		public void deleteFormview(Integer formviewId) {
			Formview formview = (Formview) sessionFactory.getCurrentSession().load(Formview.class, formviewId);
			if (null != formview) {
				this.sessionFactory.getCurrentSession().delete(formview);
			}

		}

		public Formview getFormview(int formviewid) {
			return (Formview) sessionFactory.getCurrentSession().get(Formview.class, formviewid);
		}

		public Formview updateFormview(Formview formview) {
			sessionFactory.getCurrentSession().update(formview);
			return formview;
		}


}
