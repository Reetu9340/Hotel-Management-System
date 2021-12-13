package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.FormDAO;
import com.jwt.model.Form;


@Service
@Transactional
public class FormServiceImpl implements FormService {

	@Autowired
	private FormDAO formDAO;

	@Transactional
	public void addForm(Form form) {
		formDAO.addForm(form);
	}

	@Transactional
	public List<Form> getAllForm() {
		return formDAO.getAllForm();
	}

	@Transactional
	public void deleteForm(Integer formId) {
		formDAO.deleteForm(formId);
	}

	public Form getForm(int formid) {
		return formDAO.getForm(formid);
	}

	public Form updateForm(Form form) {
		
		return formDAO.updateForm(form);
	}

	public void setFormDAO(FormDAO formDAO) {
		this.formDAO = formDAO;
	}

	

	

}
