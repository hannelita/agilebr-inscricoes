package br.com.agilebrazil.inscricoes.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.Max;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;

import br.com.caelum.vraptor.ioc.Component;

@Component
@Entity
public class Attendee {

	@Id @GeneratedValue
	private Long id;

	@NotEmpty @Size(min=6, max=10, message="long.attendee.email")
	private String email;

	@NotEmpty @Max(value=100, message="long.attendee.firstName")
	private String firstName;
	
	@NotEmpty @Max(value=100, message="long.attendee.lastName")
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Max(value=100, message="long.attendee.badgeName")
	private String badgeName;

	@Max(value=100, message="long.attendee.organization")
	private String organization;

	@Max(value=100, message="long.attendee.organization")
	private String twitter;

	@Max(value=300, message="long.attendee.address")
	private String address;
	
	@Max(value=100, message="long.attendee.neighbourhood")
	private String neighbourhood;
	
	@Max(value=10, message="long.attendee.zipcode")
	private String zipcode;
	
	@NotEmpty @Size(min=6, max=15, message="long.attendee.phone")
	private String phone;
	
	@NotEmpty
	@Max(value=100, message="long.attendee.city")
	private String city;
	
	@Enumerated(EnumType.STRING)
	private State state;
	
	@NotEmpty
	@Max(value=100, message="long.attendee.country")
	private String country;

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
		this.twitter = twitter.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address.trim();
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood.trim();
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country.trim();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city.trim();
	}

}
