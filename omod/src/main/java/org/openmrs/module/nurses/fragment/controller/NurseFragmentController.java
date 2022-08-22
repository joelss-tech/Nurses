package org.openmrs.module.nurses.fragment.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.ui.framework.fragment.FragmentModel;

public class NurseFragmentController {
	
	public void controller(FragmentModel model) {
		NursesService nursesService = Context.getService(NursesService.class);
		model.addAttribute("nurse", nursesService.getAllNurses());
		
	}
}
