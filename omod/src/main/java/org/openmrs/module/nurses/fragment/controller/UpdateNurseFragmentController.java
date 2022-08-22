package org.openmrs.module.nurses.fragment.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.ConceptService;
import org.openmrs.api.context.Context;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.module.nurses.model.Nurse;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class UpdateNurseFragmentController {
	
	NursesService nursesService;
	
	ConceptService conceptService;
	
	public void post(PageModel pageModel, HttpSession session,
	        @RequestParam(required = true, value = "NurseId") Integer NurseId,
	        @RequestParam(required = true, value = "firstName") String firstName,
	        @RequestParam(required = true, value = "lastName") String lastName,
	        @RequestParam(required = true, value = "Email") String Email,
	        @RequestParam(required = true, value = "Nin") String Nin) {
		
		nursesService = Context.getService(NursesService.class);
		Nurse nurse = nursesService.getNurseById(NurseId);
		
		if (firstName != null) {
			nurse.setFirstName(firstName);
		}
		if (lastName != null) {
			nurse.setLastName(lastName);
		}
		
		if (Email != null) {
			nurse.setLastName(lastName);
			
		}
		if (Nin != null) {
			nurse.setNin(Nin);
		}
		
	}
	
	public void get(PageModel model) {
		
	}
}
