package no.hvl.dat108;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DeltakereEAO {
	
	private List<Deltaker> deltakere;
	
	@PersistenceContext(name = "deltakerePU")
    private EntityManager em;
	
	public List<Deltaker> getDeltakere() {
		return deltakere;
	}
	
	public void oppdaterDeltakere() {
		em.merge(deltakere);
	}
	
	public void leggtilDeltaker(Deltaker deltaker) {
		deltakere.add(deltaker);
	}

}
