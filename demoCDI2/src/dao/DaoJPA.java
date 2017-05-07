package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JPA)
public class DaoJPA implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la DAO JPA";
	}

	// Après que l'objet de la classe Dao soit créé,
	// la méthode est exécutée
	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création Dao JPA");
	}

	// Avant que l'objet de la classe Dao soit détruit,
	// la méthode est exécutée
	@PreDestroy
	public void logAvantDestruction() {
		System.out.println("Avant destruction Dao JPA");
	}

}
