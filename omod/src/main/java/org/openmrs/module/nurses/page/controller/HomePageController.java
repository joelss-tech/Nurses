package org.openmrs.module.nurses.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.User;
import org.openmrs.api.ConceptService;
import org.openmrs.api.context.Context;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.module.nurses.model.Nurse;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class HomePageController {
	
	NursesService nursesService;
	
	ConceptService ConceptService;
	
	public void post(PageModel pageModel, HttpSession session,
	        @RequestParam(required = true, value = "firstName") String firstName,
	        @RequestParam(required = true, value = "lastName") String lastName,
	        @RequestParam(required = true, value = "Email") String Email,
	        @RequestParam(required = true, value = "Nin") String Nin) {
		
		nursesService = Context.getService(NursesService.class);
		User creator = Context.getUserContext().getAuthenticatedUser();
		Nurse nurse = new Nurse();
		nurse.setFirstName(firstName);
		nurse.setLastName(lastName);
		nurse.setEmail(Email);
		nurse.setNin(Nin);
		nurse.setVoided(false);
		
		nursesService.saveOrUpdate(nurse);
		
	}
	
	public void get(PageModel model) {
		
	}
}
