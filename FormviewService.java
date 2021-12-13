package com.jwt.service;

import java.util.List;

import com.jwt.model.Formview;

public interface FormviewService {
	public void addFormview(Formview formview);

	public List<Formview> getAllFormview();

	public void deleteFormview(Integer formviewId);

	public Formview getFormview(int formviewid);

	public Formview updateFormview(Formview formview);

}
