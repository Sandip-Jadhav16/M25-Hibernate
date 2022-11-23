package org.tnsindia.onetooneunidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//data member
	@Id
	private int ID;
	private String Name;
	
	@JoinColumn(name="area")
	
	//unidirectional onetoone
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	//getters and setters method
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
