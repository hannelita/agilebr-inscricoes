package br.com.agilebrazil.inscricoes.controllers;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.agilebrazil.inscricoes.dao.AttendeeDAO;
import br.com.agilebrazil.inscricoes.model.Attendee;
import br.com.agilebrazil.inscricoes.model.Gender;
import br.com.agilebrazil.inscricoes.model.State;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.com.caelum.vraptor.validator.ValidationException;

@RunWith(MockitoJUnitRunner.class)
public class AttendeesControllerTest {

	private @Mock Result result;
	private @Spy Validator validator = new MockValidator();
	private @Mock AttendeeDAO attendeeDAO;
	
	@Test(expected=ValidationException.class)
	public void shouldNotCreateAttendeeWhenEmailConfirmationDontMatch() {
		AttendeesController controller = new AttendeesController(result, validator, attendeeDAO);
		when(attendeeDAO.alreadyExists(any(Attendee.class))).thenReturn(false);

		Attendee attendee = createAttendee();
		attendee.setEmail("some@email.com");
		controller.create(attendee, "other@email.com");
	}

	@Test
	public void shouldCreateAttendeeWhenEmailConfirmationMatch() {
		AttendeesController controller = new AttendeesController(result, validator, attendeeDAO);
		when(attendeeDAO.alreadyExists(any(Attendee.class))).thenReturn(false);
		
		Attendee attendee = createAttendee();
		attendee.setEmail("same@email.com");
		controller.create(attendee, "same@email.com");
		
		verify(attendeeDAO).save(attendee);
	}
	
	@Test(expected=ValidationException.class)
	public void shouldNotCreateAttendeeWhenEmailIsntLowerCase() {
		AttendeesController controller = new AttendeesController(result, validator, attendeeDAO);
		when(attendeeDAO.alreadyExists(any(Attendee.class))).thenReturn(false);
		
		Attendee attendee = createAttendee();
		attendee.setEmail("UpperCase@email.com");
		controller.create(attendee, "UpperCase@email.com");
	}
	
	private Attendee createAttendee() {
		Attendee attendee = new Attendee();
		attendee.setFirstName("John");
		attendee.setLastName("Doe");
		attendee.setEmail("some@email.com");
		attendee.setGender(Gender.MALE);
		attendee.setBadgeName("Johnny");
		attendee.setOrganization("My Startup");
		attendee.setTwitter("@startuper");
		attendee.setAddress("14 Some Nice Rd");
		attendee.setNeighbourhood("Good Place");
		attendee.setZipcode("04251");
		attendee.setPhone("+1 555 875 9856");
		attendee.setCity("Good Village");
		attendee.setState(State.NOT_APPLICABLE);
		attendee.setCountry("Different Country");
		return attendee;
	}

}
