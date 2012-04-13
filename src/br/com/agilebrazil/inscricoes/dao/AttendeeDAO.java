package br.com.agilebrazil.inscricoes.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.agilebrazil.inscricoes.model.Attendee;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class AttendeeDAO {
	
	private final EntityManager em;

	public AttendeeDAO(EntityManager em) {
		this.em = em;
		
	}

	public boolean doesntExist(Attendee attendee) {
		String jpql = "select email from Attendee attendee where attendee.email =:email";
		TypedQuery<Attendee> query = em.createQuery(jpql, Attendee.class);
		query.setParameter("email", attendee.getEmail());
		
		Attendee result = query.getSingleResult();
		return result==null;
	}

	public void save(Attendee attendee) {
		em.persist(attendee);
	}

}
