package org.openmrs.module.nurses.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "r_nurses")
public class Nurse {
	
	@Id
	@GeneratedValue
	@Column
	private Integer Id;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String firstName;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String lastName;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String Nin;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String Email;
	
	@Basic
	@Column(columnDefinition = "BOOLEAN DEFAULT false")
	private Boolean voided;
	
	public Nurse() {
	}
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNin() {
		return Nin;
	}
	
	public void setNin(String nin) {
		Nin = nin;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public Boolean getVoided() {
		return voided;
	}
	
	public void setVoided(Boolean voided) {
		this.voided = voided;
	}
	
}
