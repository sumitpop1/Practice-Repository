package springboot.rahul.impl;

import javax.persistence.EntityManager;

import springboot.rahul.dao.PersistenceManager;
import springboot.rahul.entity.PersonalInfo;

public class GetDbImpl {
	public static void main(String[] args) {
		PersonalInfo info = new PersonalInfo();
		//address.setCity("Dhaka").setCountry("Bangladesh").setPostcode("1000").setStreet("Poribagh");
		//info.setId(3);
		info.setName("Rocky");
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(info);
		em.getTransaction().commit();
		PersonalInfo resInfo = em.find(PersonalInfo.class, 1);
		System.out.println(resInfo.getName());
		em.close();
		PersistenceManager.INSTANCE.close();

	}
}