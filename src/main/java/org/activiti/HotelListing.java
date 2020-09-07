package org.activiti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HotelListing {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    private String noOfRooms;
    
    private String sizeOfRooms;
    
    private String noOfPerson;
    
    public HotelListing() {

    }

    
    public HotelListing(String name, String email, String phoneNumber, String noOfRooms, String sizeOfRooms,
			String noOfPerson) {
		super();
		 
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.noOfRooms = noOfRooms;
		this.sizeOfRooms = sizeOfRooms;
		this.noOfPerson = noOfPerson;
	}


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	public String getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(String noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getSizeOfRooms() {
		return sizeOfRooms;
	}

	public void setSizeOfRooms(String sizeOfRooms) {
		this.sizeOfRooms = sizeOfRooms;
	}

	public String getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(String noOfPerson) {
		this.noOfPerson = noOfPerson;
	}
    
    
    
}