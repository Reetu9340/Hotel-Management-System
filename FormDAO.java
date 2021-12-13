package com.jwt.dao;

import java.util.List;

import com.jwt.model.Form;

public interface FormDAO {
	

	public void addForm(Form form);

	public List<Form> getAllForm();

	public void deleteForm(Integer formId);

	public Form updateForm(Form form);

	public Form getForm(int formid);


}
