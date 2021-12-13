package com.jwt.service;

import java.util.List;

import com.jwt.model.Signup;
public interface SignupService {
	
	public void addSignup(Signup signup);

	public List<Signup> getAllSignup();
	
	public void deleteSignup(Integer signupId);

	public Signup getSignup(int signupid);

	public Signup updateSignup(Signup signup);

}
