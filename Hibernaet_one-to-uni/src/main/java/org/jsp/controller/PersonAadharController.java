package org.jsp.controller;
import org.jsp.dao.PersonAadharCardDao;
import org.jsp.dto.AadharCard;
import org.jsp.dto.Person;
public class PersonAadharController {


	public static void main(String[] args) {

		Person p=new Person();
		AadharCard card=new AadharCard();
		p.setId(104);
		p.setName("sri");
		p.setCard(card);
		
		card.setId(114);
		card.setName("AAdhar");
		card.setNumber(123456789L);
		card.setAddress("surya");
		
		PersonAadharCardDao dao=new PersonAadharCardDao();
		dao.savePerson(p);
//		dao.FindpersonById(101);
//		dao.FindAadharById(111);
//		dao.addadharcardToAperson(102, a);
//		dao.removeadharcardToAperson(102);
//		dao.update(p);
//		dao.remove(103);
	}

}