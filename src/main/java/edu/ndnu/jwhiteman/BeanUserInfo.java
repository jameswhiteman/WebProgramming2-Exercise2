package edu.ndnu.jwhiteman;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;

@ManagedBean
@Named("beanUserInfo")
@SessionScoped
public class BeanUserInfo
{
	// Properties
	@ManagedProperty(value="#{beanVoterCount}")
	private BeanVoterCount beanVoterCount;
	private String firstName = "James";
	private String lastName = "Whiteman";
	private String phoneNumber = "(805) 416-6912";
	private String zipCode = "94002";
	private int party = 1;

	// Main Methods
	public String infoSubmitted()
	{
		User user = new User(firstName, lastName, phoneNumber, zipCode, getPartyName());
		beanVoterCount.addVoter(user);
		return "/thank_you.xhtml";
	}

	public String getPartyName()
	{
		switch (party)
		{
			case 1:
				return "Democrat";
			case 2:
				return "Green Party";
			case 3:
				return "Libertarian";
			case 4:
				return "Republican";
			default:
				return "Unaffiliated";
		}
	}

	// Setters
	public void setBeanVoterCount(BeanVoterCount beanVoterCount)
	{
		this.beanVoterCount = beanVoterCount;
	}

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

	public void setParty(int party)
	{
		this.party = party;
	}

	// Getters
	public BeanVoterCount getBeanVoterCount()
	{
		return beanVoterCount;
	}

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

	public int getParty()
	{
		return party;
	}
}