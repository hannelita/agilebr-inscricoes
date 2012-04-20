package br.com.agilebrazil.inscricoes.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.Email;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotEmpty;

import br.com.caelum.vraptor.ioc.Component;

@Component
@Entity
public class Attendee {

	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty(message = "empty.attendee.firstName")
	@Length(max = 100, message = "long.attendee.firstName")
	private String firstName;

	@NotEmpty(message = "empty.attendee.firstName")
	@Length(max = 100, message = "long.attendee.lastName")
	private String lastName;

	@Length(max = 100, message = "long.attendee.badgeName")
	private String badgeName;
	
	@NotEmpty(message = "empty.attendee.email")
	@Email(message = "invalid.attendee.email")
	@Length(min = 6, max = 100, message = "long.attendee.email")
	private String email;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Length(max = 100, message = "long.attendee.twitter")
	private String twitter;

	@Length(max = 100, message = "long.attendee.organization")
	private String organization;

	@NotEmpty
	@Length(min = 6, max = 15, message = "long.attendee.phone")
	private String phone;

	@Embedded 
	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.trim().toLowerCase();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.trim();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.trim();
	}

	public String getBadgeName() {
		if (badgeName == null) {
			badgeName = firstName + " " + lastName;
		}
		return badgeName;
	}

	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName.trim();
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization.trim();
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter.trim().replace("@", "");
	}

	public String getAddress() {
		return address.getStreet();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getNeighbourhood() {
		return address.getNeighbourhood();
	}

	public void setNeighbourhood(String neighbourhood) {
		this.address.setNeighbourhood(neighbourhood.trim());
	}

	public String getZipcode() {
		return address.getZipcode();
	}

	public void setZipcode(String zipcode) {
		this.address.setZipcode(zipcode.trim());
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone.trim();
	}

	public String getCountry() {
		return address.getCountry();
	}

	public void setCountry(String country) {
		this.address.setCountry(country.trim());
	}

	public State getState() {
		return address.getState();
	}

	public void setState(State state) {
		this.address.setState(state);
	}

	public String getCity() {
		return address.getCity();
	}

	public void setCity(String city) {
		this.address.setCity(city.trim());
	}

}
