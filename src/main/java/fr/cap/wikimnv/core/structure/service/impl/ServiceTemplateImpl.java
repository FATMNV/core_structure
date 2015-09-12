package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Template;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceTemplate;

public class ServiceTemplateImpl implements IServiceTemplate {
	
	PersistanceCli sCrud ;

	public void ajouterMeta(Template template, String metadonnee) throws MNVException {
		template.getMeta().add(metadonnee);
		this.sauver(template);
	}

	public void supprimerMeta(Template template, String metadonnee) throws MNVException{
		template.getMeta().remove(metadonnee); 
		this.sauver(template);
	}

	public Object lire(Object obj, Class cls) throws MNVException, MNVException_Exception {
		// TODO Auto-generated method stub
		return sCrud.lire(obj, TypeStructure.TEMPLATE);
	}

	public List<Object> lister(Class cls) throws MNVException, MNVException_Exception {
		// TODO Auto-generated method stub
		return sCrud.lister(TypeStructure.TEMPLATE);
	}

	public Object sauver(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return sCrud.sauver(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return sCrud.supprimer(obj);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Object lire(Object arg0, TypeStructure arg1) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<?> lister(TypeStructure arg0) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public PersistanceCli getsCrud() {
		return sCrud;
	}

	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}
	
	

}
