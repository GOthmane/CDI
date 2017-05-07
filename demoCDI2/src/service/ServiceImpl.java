package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import dao.IDao;
import dao.NotificationTypeDao;
import dao.NotificationTypeDao.TypeDao;

public class ServiceImpl implements IService {

	@Inject
	@NotificationTypeDao(TypeDao.JDBC)
	private IDao idao;
	@Override
	public String appelDao() {
		return idao.appelDao();
	}
	
	// Apr�s que l'objet de la classe ServiceImpl
	// soit cr��, la m�thode est ex�cut�e
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Apr�s cr�ation Service");
	}
		
	// Avant que l'objet de la classe ServiceImpl
	// soit d�truit, la m�thode est ex�cut�e
	@PreDestroy
	public void logAvantDestruction(){
		System.out.println("Avant destruction Service");
	}	

}
