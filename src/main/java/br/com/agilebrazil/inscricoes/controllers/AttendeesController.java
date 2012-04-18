package br.com.agilebrazil.inscricoes.controllers;

import br.com.agilebrazil.inscricoes.dao.AttendeeDAO;
import br.com.agilebrazil.inscricoes.model.Attendee;
import br.com.agilebrazil.inscricoes.model.Gender;
import br.com.agilebrazil.inscricoes.model.State;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;

@Resource
public class AttendeesController {

	private final AttendeeDAO dao;
	private final Result result;
	private final Validator validator;

	public AttendeesController(Result result, Validator validator, AttendeeDAO attendeeDAO) {
		this.result = result;
		this.validator = validator;
		this.dao = attendeeDAO;
	}
	
	public void index(){
		result.include("states", State.values());
		result.include("genders", Gender.values());
	}
	
	@Post
	public void create(Attendee attendee, String emailConfirmation){
		validator.validate(attendee);
		if (!attendee.getEmail().equals(emailConfirmation))
			validator.add(new ValidationMessage("email.confirmation", "attendee"));
		if(dao.alreadyExists(attendee)){
			validator.add(new ValidationMessage("already.registered", "attendee"));
		}
		validator.onErrorForwardTo(this).index();
		dao.save(attendee);
	}

}
