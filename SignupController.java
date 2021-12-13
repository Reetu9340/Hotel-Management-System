package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Payment;
import com.jwt.model.Signup;
import com.jwt.service.SignupService;



@Controller
public class SignupController {

	
	private static final Logger logger = Logger
			.getLogger(SignupController.class);

	public SignupController() {
		System.out.println("SignupController()");
	}

	@Autowired
	private SignupService signupService;
	
	
	
	@RequestMapping(value = "/Signup")
	public ModelAndView listSignup(ModelAndView model) throws IOException {
		model.addObject("signup", new Signup());
		model.setViewName("Signup");
		return model;
	}

	@RequestMapping(value = "/listSignup")
	public ModelAndView listPayment(ModelAndView model) throws IOException {
		List<Signup> listSignup = signupService.getAllSignup();
		model.addObject("listSignup", listSignup(null));
		model.setViewName("Signup");
		return model;
	}
	@RequestMapping(value = "/newSignup", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Signup signup = new Signup();
		model.addObject("signup", signup);
		model.setViewName("Signup");
		return model;
	}

	@RequestMapping(value = "/saveSignup", method = RequestMethod.POST)
	public ModelAndView saveSignup(@ModelAttribute Signup signup) {
		if (signup.getId() == 0) { // if signup id is 0 then creating the
			// Signup other updating the Signup
			signupService.addSignup(signup);
		} else {
			signupService.updateSignup(signup);
		}
		return new ModelAndView("redirect:/Form");
	}

	

	@RequestMapping(value = "/editSignup", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int signupId = Integer.parseInt(request.getParameter("id"));
		Signup signup = signupService.getSignup(signupId);
		ModelAndView model = new ModelAndView("Signup");
		model.addObject("signup", signup);

		return model;
	}
	
	@RequestMapping(value = "/deleteSignup", method = RequestMethod.GET)
	public ModelAndView deleteSignup(HttpServletRequest request) {
		int signupId = Integer.parseInt(request.getParameter("id"));
		signupService.deleteSignup(signupId);
		return new ModelAndView("redirect:/User");
	}
	
	
	@RequestMapping("/Aboutus")
	public ModelAndView showMessage
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("Aboutus");
			return mv;
		}
	
	@RequestMapping("/index")
	public ModelAndView showMessage1
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("index");
			return mv;
		}

	@RequestMapping("/attraction")
	public ModelAndView showMessage2
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("attraction");
			return mv;
		}

	
	@RequestMapping("/Admin")
	public ModelAndView showMessage4
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("Admin");
			return mv;
		}
	@RequestMapping("/LoginWorking")
	public ModelAndView showMessage5
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("LoginWorking");
			return mv;
		}
	
	
	@RequestMapping("/payment")
	public ModelAndView showMessage11
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("payment");
			return mv;
		}

	@RequestMapping("/ShowBooking")
	public ModelAndView showMessage12
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("ShowBooking");
			return mv;
		}


	@RequestMapping("/payment_form")
	public ModelAndView showMessage13
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("payment_form");
			return mv;
		}


	@RequestMapping("/feeback")
	public ModelAndView showMessage14
	(
		@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
		{
			System.out.println("in controller");
			ModelAndView mv = new ModelAndView("feeback");
			return mv;
		}

}
