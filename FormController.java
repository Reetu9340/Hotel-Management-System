package com.jwt.controller;

import java.io.IOException;




import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Form;
import com.jwt.service.FormService;

@Controller
public class FormController {
	
	
	private static final Logger logger = Logger
			.getLogger(FormController.class);

	public FormController() {
		System.out.println("FormController()");
	}

	@Autowired
	private FormService formService;
	


	
	@RequestMapping(value = "/Form")
	public ModelAndView listForm(ModelAndView model) throws IOException {
		model.addObject("form", new Form());
		model.setViewName("Form");
		return model;
	}

	@RequestMapping(value = "/newForm", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Form form = new Form();
		model.addObject("form", form);
		model.setViewName("Form");
		return model;
	}

	@RequestMapping(value = "/saveForm", method = RequestMethod.POST)
	public ModelAndView saveForm(@ModelAttribute Form form) {
		if (form.getId() == 0) { // if form id is 0 then creating the
			// form other updating the form
			formService.addForm(form);
		} else {
			formService.updateForm(form);
		}
		return new ModelAndView("redirect:/payment");
	}

	

	@RequestMapping(value = "/editForm", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int formId = Integer.parseInt(request.getParameter("id"));
		Form form = formService.getForm(formId);
		ModelAndView model = new ModelAndView("Form");
		model.addObject("form", form);

		return model;
	}
	

}

