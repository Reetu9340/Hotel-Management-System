package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.FormviewDAO;
import com.jwt.model.Formview;

	@Service
	@Transactional
	public class FormviewServiceImpl implements FormviewService {

		@Autowired
		private FormviewDAO formviewDAO;

		@Transactional
		public void addFormview(Formview formview) {
			formviewDAO.addFormview(formview);
		}

		@Transactional
		public List<Formview> getAllFormview() {
			return formviewDAO.getAllFormview();
		}

		@Transactional
		public void deleteFormview(Integer formviewId) {
			formviewDAO.deleteFormview(formviewId);
		}

		public Formview getFormview(int formviewid) {
			return formviewDAO.getFormview(formviewid);
		}

		public Formview updateFormview(Formview formview) {
			
			return formviewDAO.updateFormview(formview);
		}

		public void setFormviewDAO(FormviewDAO formviewDAO) {
			this.formviewDAO = formviewDAO;
		}


}
