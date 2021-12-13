package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Form;

@Repository
public class FormDAOImpl implements FormDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addForm(Form form) {
		sessionFactory.getCurrentSession().saveOrUpdate(form);

	}

	@SuppressWarnings("unchecked")
	public List<Form> getAllForm() {
		return sessionFactory.getCurrentSession().createQuery("from Form").list();
	}

	public void deleteForm(Integer formId) {
		Form form = (Form) sessionFactory.getCurrentSession().load(Form.class, formId);
		if (null != form) {
			this.sessionFactory.getCurrentSession().delete(form);
		}

	}

	public Form getForm(int formid) {
		return (Form) sessionFactory.getCurrentSession().get(Form.class, formid);
	}

	public Form updateForm(Form form) {
		sessionFactory.getCurrentSession().update(form);
		return form;
	}

}