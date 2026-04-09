package org.jsp.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.jsp.dto.AadharCard;
import org.jsp.dto.Person;

public class PersonAadharCardDao {


	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetooneuni");
	private EntityManager em=emf.createEntityManager();
	private EntityTransaction et=em.getTransaction();
	
	public void savePerson(Person person)
	{
		et.begin();
		em.persist(person);
		et.commit();
		System.out.println("Saved Sucessfully");
	}
	
	public void findpersonbyId(int id)
	{
	      Person p=	em.find(Person.class, id);
	      if(p!=null)
	      {
	    	  System.out.println(p);
	      }
	      else
	    	  throw new RuntimeException("user not found");
	}
	

public void remove(int id) {
	  Person p =em.find(Person.class, id);
	if(p!=null) {
		 et.begin();
		 em.remove(p);
		 et.commit();
		 System.out.println("removed");
	}
}
public void update(Person person) {
	  Person p =em.find(Person.class, person.getId());
	if(p!=null) {
		 et.begin();
		 em.merge(person);
		 et.commit();
		 System.out.println("updated");
	}
}




	 public void FindAadharById(int id) {
		  AadharCard p =em.find(AadharCard.class, id);
		if(p!=null) {
			System.out.println(p);
		}
}
	 public void addadharcardToAperson(int id,AadharCard a) {
		  Person p =em.find(Person.class, id);
			if(p!=null && p.getCard()==null) {
				et.begin();
				em.persist(a);
				p.setCard(a);
				em.merge(p);
				et.commit();
				System.out.println("saved");
			}
			else{
				 throw new RuntimeException("data not found");
			}
			
		 
	 }
	 public void removeadharcardToAperson(int id) {
		  Person p =em.find(Person.class, id);
			if(p!=null) {
				AadharCard a =p.getCard();
				et.begin();
				p.setCard(null);
				em.merge(p);
				em.remove(a);
				et.commit();
				System.out.println("removed");
			}else{
				 throw new RuntimeException("data not found");
			}
			
		 
	 }

}
