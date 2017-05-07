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
	
	// Après que l'objet de la classe ServiceImpl
	// soit créé, la méthode est exécutée
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Après création Service");
	}
		
	// Avant que l'objet de la classe ServiceImpl
	// soit détruit, la méthode est exécutée
	@PreDestroy
	public void logAvantDestruction(){
		System.out.println("Avant destruction Service");
	}	

}
