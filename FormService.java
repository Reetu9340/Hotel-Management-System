package com.jwt.service;

import java.util.List;

import com.jwt.model.Form;


public interface FormService {
	

	public void addForm(Form form);

	public List<Form> getAllForm();

	public void deleteForm(Integer formId);

	public Form getForm(int formid);

	public Form updateForm(Form form);

}
