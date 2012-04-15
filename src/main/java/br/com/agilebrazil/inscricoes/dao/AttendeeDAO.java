package br.com.agilebrazil.inscricoes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.agilebrazil.inscricoes.model.Attendee;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class AttendeeDAO {
	
	private final EntityManager em;

	public AttendeeDAO(EntityManager em) {
		this.em = em;
		
	}

	@SuppressWarnings("unchecked")
	public boolean alreadyExists(Attendee attendee) {
		String jpql = "select attendee from Attendee attendee where attendee.email =:email";
		Query query = em.createQuery(jpql);
		query.setParameter("email", attendee.getEmail());
		
		List<Attendee> result = query.getResultList();
		return result.size()!=0;
	}

	public void save(Attendee attendee) {
		em.persist(attendee);
	}

}
