/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.nurses.api.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.openmrs.api.APIException;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.nurses.Item;
import org.openmrs.module.nurses.model.Nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("nurses.NursesDao")
public class NursesDao {
	
	@Autowired
	DbSessionFactory sessionFactory;
	
	private DbSession getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public Item getItemByUuid(String uuid) {
		return (Item) getSession().createCriteria(Item.class).add(Restrictions.eq("uuid", uuid)).uniqueResult();
	}
	
	public Item saveItem(Item item) {
		getSession().saveOrUpdate(item);
		return item;
	}
	
	public Nurse saveOrUpdate(Nurse nurse) throws APIException {
		getSession().saveOrUpdate(nurse);
		return nurse;
	}
	
	public Nurse getNurseById(int nurseId) throws APIException {
		return (Nurse) getSession().get(Nurse.class, nurseId);
	}
	
	@SuppressWarnings("unchecked")
	public List<Nurse> getAllNurses() throws APIException {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Nurse.class);
		criteria.add(Restrictions.eq("voided", false));
		return criteria.list();
	}
	
	public void deleteNurse(Nurse nurse) throws APIException {
		getSession().delete(nurse);
	}
	
}
