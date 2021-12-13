package com.jwt.dao;

import java.util.List;

import com.jwt.model.Formview;


public interface FormviewDAO {
	
	public void addFormview(Formview formview);

	public List<Formview> getAllFormview();

	public void deleteFormview(Integer formviewId);

	public Formview updateFormview(Formview formview);

	public Formview getFormview(int formviewid);

}
