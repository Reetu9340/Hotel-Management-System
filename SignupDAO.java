package com.jwt.dao;


import java.util.List;



import com.jwt.model.Signup;


public interface SignupDAO {
	public void addSignup(Signup signup);

	public List<Signup> getAllSignup();

	public Signup updateSignup(Signup signup);

	public Signup getSignup(int signupid);
	
	public void deleteSignup(Integer signupId);


}
