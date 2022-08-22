package org.openmrs.module.nurses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openmrs.module.nurses.api.NursesService;
import org.openmrs.module.nurses.api.dao.NursesDao;
import org.openmrs.module.nurses.api.impl.NursesServiceImpl;
import org.openmrs.module.nurses.model.Nurse;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public class NurseServiceTest extends BaseModuleContextSensitiveTest {
	
	@InjectMocks
	NursesServiceImpl basicModuleService;
	
	@Mock
	NursesDao dao;
	
	@Mock
	NursesService service;
	
	@Before
	public void setupMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void save_shouldSetNurseIfNotSet() {
		//Given
		Nurse nurse = new Nurse();
		
		nurse.setFirstName("kiyemba");
		
		when(dao.saveOrUpdate(nurse)).thenReturn(nurse);
		
		service.getNurseById(1);
		
		//When
		basicModuleService.saveOrUpdate(nurse);
		
		//Then
		Assert.assertEquals(nurse, nurse);
	}
	
	@Test
	public void delete_shouldDeleteNurseById() {
		Nurse nurse = new Nurse();
		nurse.getId();
		
		service.deleteNurse(nurse);
		
		assertEquals(nurse.getFirstName(), null);
	}
	
}
