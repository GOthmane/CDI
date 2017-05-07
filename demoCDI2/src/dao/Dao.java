package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JDBC)
public class Dao implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la DAO JDBC";
	}
	
	// Apr�s que l'objet de la classe Dao soit cr��,
	// la m�thode est ex�cut�e
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Apr�s cr�ation Dao JDBC");
	}
	
	// Avant que l'objet de la classe Dao soit d�truit,
	// la m�thode est ex�cut�e
	@PreDestroy
	public void logAvantDestruction(){
		System.out.println("Avant destruction Dao JDBC");
	}

}
