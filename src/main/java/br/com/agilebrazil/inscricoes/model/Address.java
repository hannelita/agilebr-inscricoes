package br.com.agilebrazil.inscricoes.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotEmpty;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class Address {

	@Length(max = 300, message = "long.address.street")
	private String street;

	@Length(max = 100, message = "long.address.neighbourhood")
	private String neighbourhood;

	@Length(max = 10, message = "long.address.zipcode")
	private String zipcode;

	@NotEmpty
	@Length(max = 100, message = "long.address.city")
	private String city;

	@Enumerated(EnumType.STRING)
	private State state;

	@NotEmpty
	@Length(max = 100, message = "long.address.country")
	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String address) {
		this.street = address;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}