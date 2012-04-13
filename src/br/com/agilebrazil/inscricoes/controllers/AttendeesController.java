package br.com.agilebrazil.inscricoes.controllers;

import br.com.agilebrazil.inscricoes.dao.AttendeeDAO;
import br.com.agilebrazil.inscricoes.model.Attendee;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class AttendeesController {
	

	private final AttendeeDAO attendeeDAO;


	public AttendeesController(AttendeeDAO attendeeDAO) {
		this.attendeeDAO = attendeeDAO;
		
	}
	
	public void index(){
		
	}
	
	
	public void create(Attendee attendee){
		if(attendeeDAO.doesntExist(attendee)){
			attendeeDAO.save(attendee);
		}
	}

}
