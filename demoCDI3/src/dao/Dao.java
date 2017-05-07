package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la DAO";
	}
	
	// Apr�s que l'objet de la classe Dao soit cr��,
	// la m�thode est ex�cut�e
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Apr�s cr�ation Dao");
	}
	
	// Avant que l'objet de la classe Dao soit d�truit,
	// la m�thode est ex�cut�e
	@PreDestroy
	public void logAvantDestruction(){
		System.out.println("Avant destruction Dao");
	}

}
