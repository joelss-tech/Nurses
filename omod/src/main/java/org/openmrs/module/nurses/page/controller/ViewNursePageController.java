package org.openmrs.module.nurses.page.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.module.nurses.model.Nurse;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class ViewNursePageController {
	
	NursesService nursesService;
	
	public void controller(PageModel model, @RequestParam(required = true, value = "nurseId") Integer nurseId) {
		nursesService = Context.getService(NursesService.class);
		Nurse nurse = nursesService.getNurseById(nurseId);
		model.addAttribute("nurse", nurse);
		
	}
}
