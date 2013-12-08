package edu.ndnu.jwhiteman;

public class User
{
	// Properties
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String zipCode;
	private String party;

	// Constructor
	public User(String firstName, String lastName, String phoneNumber, String zipCode, String party)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
		this.party = party;
	}

	// Setters
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public void setParty(String party)
	{
		this.party = party;
	}

	// Getters
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public String getParty()
	{
		return party;
	}
}