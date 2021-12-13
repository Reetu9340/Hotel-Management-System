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

import com.jwt.model.Formview;
import com.jwt.service.FormviewService;


@Controller
public class FormviewController {
	
	
	private static final Logger logger = Logger
			.getLogger(FormviewController.class);

	public FormviewController() {
		System.out.println("FormviewController()");
	}

	@Autowired
	private FormviewService formviewService;
	
	@RequestMapping(value = "/Formview")
	public ModelAndView listFormview(ModelAndView model) throws IOException {
		List<Formview> listFormview = formviewService.getAllFormview();
		model.addObject("listFormview", listFormview);
		model.setViewName("ShowBooking");
		return model;
	}

	@RequestMapping(value = "/newFormview", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Formview formview = new Formview();
		model.addObject("formview", formview);
		model.setViewName("Formview");
		return model;
	}

	@RequestMapping(value = "/saveFormview", method = RequestMethod.POST)
	public ModelAndView saveFormview(@ModelAttribute Formview formview) {
		if (formview.getId() == 0) { // if form id is 0 then creating the
			// form other updating the form
			formviewService.addFormview(formview);
		} else {
			formviewService.updateFormview(formview);
		}
		return new ModelAndView("redirect:/Formview");
	}

	

	@RequestMapping(value = "/editFormview", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int formviewId = Integer.parseInt(request.getParameter("id"));
		Formview formview = formviewService.getFormview(formviewId);
		ModelAndView model = new ModelAndView("Formview");
		model.addObject("formview", formview);

		return model;
	}
	
	@RequestMapping(value = "/deleteFormview", method = RequestMethod.GET)
	public ModelAndView deleteFormview(HttpServletRequest request) {
		int formviewId = Integer.parseInt(request.getParameter("id"));
		formviewService.deleteFormview(formviewId);
		return new ModelAndView("redirect:/Formview");
	}

}

