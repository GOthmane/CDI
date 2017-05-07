package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import dao.IDao;
import interceptor.Audited;
import interceptor.Connected;
import interceptor.Timed;

@Audited
@Connected
@Timed
public class ServiceImpl implements IService {

	@Inject
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
