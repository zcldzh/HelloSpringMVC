package net.paxcel.springmvc.session1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_NAME")
public class UserName {
	private Long id;
	private String firstName;
	private String lastName;
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "FIRST_NAME", length = 100)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "LAST_NAME", length = 100)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	public void setLastNameA(String lastName) {
		this.lastName = lastName;
	}
	
	public void setLastNameB(String lastName) {
		this.lastName = lastName;
	}
	
	public void setLastNameC(String lastName) {
		this.lastName = lastName;
	}
}
