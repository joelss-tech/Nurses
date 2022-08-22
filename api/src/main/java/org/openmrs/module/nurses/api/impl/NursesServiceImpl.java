/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.nurses.api.impl;

import java.util.List;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.nurses.Item;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.module.nurses.api.dao.NursesDao;
import org.openmrs.module.nurses.model.Nurse;

public class NursesServiceImpl extends BaseOpenmrsService implements NursesService {
	
	NursesDao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(NursesDao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public Item getItemByUuid(String uuid) throws APIException {
		return dao.getItemByUuid(uuid);
	}
	
	@Override
	public Item saveItem(Item item) throws APIException {
		if (item.getOwner() == null) {
			item.setOwner(userService.getUser(1));
		}
		
		return dao.saveItem(item);
	}
	
	@Override
	public Nurse saveOrUpdate(Nurse nurse) throws APIException {
		
		return dao.saveOrUpdate(nurse);
	}
	
	@Override
	public Nurse getNurseById(int nurseId) throws APIException {
		
		return dao.getNurseById(nurseId);
	}
	
	@Override
	public List<Nurse> getAllNurses() throws APIException {
		
		return dao.getAllNurses();
	}
	
	@Override
	public void deleteNurse(Nurse nurse) throws APIException {
		dao.deleteNurse(nurse);
		
	}
}
