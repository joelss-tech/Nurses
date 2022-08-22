package org.openmrs.module.nurses.page.controller;

import javax.servlet.http.HttpSession;

import org.openmrs.api.context.Context;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.module.nurses.model.Nurse;
import org.openmrs.module.uicommons.util.InfoErrorMessageUtil;
import org.springframework.web.bind.annotation.RequestParam;

public class DeleteNursePageController {
	
	NursesService nursesService;
	
	public String controller(HttpSession session, @RequestParam(required = true, value = "nurseId") Integer nurseId) {
		nursesService = Context.getService(NursesService.class);
		Nurse nurse = nursesService.getNurseById(nurseId);
		nurse.setVoided(true);
		nursesService.saveOrUpdate(nurse);
		InfoErrorMessageUtil.flashInfoMessage(session, "nurse deleted successfully.........." + nurse.getFirstName());
		
		return "allNurses";
	}
}
