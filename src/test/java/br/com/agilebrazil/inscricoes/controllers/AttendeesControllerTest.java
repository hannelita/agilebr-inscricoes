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

		controller.create(createAttendeeWith("some@email.com"), "other@email.com");
	}

	@Test
	public void shouldCreateAttendeeWhenEmailConfirmationMatch() {
		AttendeesController controller = new AttendeesController(result, validator, attendeeDAO);
		when(attendeeDAO.alreadyExists(any(Attendee.class))).thenReturn(false);
		
		Attendee attendee = createAttendeeWith("same@email.com");
		controller.create(attendee, "same@email.com");
		
		verify(attendeeDAO).save(attendee);
	}
	
	private Attendee createAttendeeWith(String email) {
		Attendee attendee = new Attendee();
		attendee.setAddress("R. Vergueiro, 3185");
		attendee.setEmail(email);
		return attendee;
	}

}
