package com.jwt.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.SignupDAO;
import com.jwt.model.Signup;

@Service
@Transactional
public class SignupServiceImpl implements SignupService {
	@Autowired
	private SignupDAO signupDAO;

	@Transactional
	public void addSignup(Signup signup) {
		signupDAO.addSignup(signup);
	}

	@Transactional
	public List<Signup> getAllSignup() 
	{
		return signupDAO.getAllSignup();
	}


	public Signup getSignup(int signupid) {
		return signupDAO.getSignup(signupid);
	}

	public Signup updateSignup(Signup signup) {
	
		return signupDAO.updateSignup(signup);
	}
	

	public void setSignupDAO(SignupDAO signupDAO) {
		this.signupDAO = signupDAO;
	}

	@Transactional
	public void deleteSignup(Integer signupId) {
		signupDAO.deleteSignup(signupId);
	}



}
