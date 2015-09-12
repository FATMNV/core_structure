package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.Query;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceArticle;

public class ServiceArticleImpl implements IServiceArticle {
	PersistanceCli sCrud ;
	

	public void changerEtat(EtatPublication etatPublication, Object idArticle) throws MNVException {
		Article article = null;
		try {
			article = (Article) sCrud.lire(idArticle, TypeStructure.ARTICLE);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		article.setEtat(etatPublication);
	}

	public List<Object> lister(Class cl) throws MNVException {
		try {
			return sCrud.lister(TypeStructure.ARTICLE);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param idArticle
	 * @throws MNVException
	 */

	public Object supprimer(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return sCrud.supprimer(idArticle);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idArticle;
	}

	public Object sauver(Object idArticle) throws MNVException {
		// TODO Auto-generated method stub
		try {
			return sCrud.sauver(idArticle);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// passer l'id et le type
		return idArticle;
	}

	public PersistanceCli getsCrud() {
		return sCrud;
	}

	public void setsCrud(PersistanceCli sCrud) {
		this.sCrud = sCrud;
	}

	public Object lire(Object idArticle, Class cls) throws MNVException {
		try {
			return sCrud.lire(idArticle, TypeStructure.ARTICLE);
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return cls;

	}

	@Override
	public Object lire(Object arg0, fr.cap.wikimnv.core.pojo.TypeStructure arg1)
			throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<?> lister(fr.cap.wikimnv.core.pojo.TypeStructure arg0)
			throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object rechercher(Query query, Map<String, Object> params) {
		// return sCrud.faireRequete(query, params) ;
		return null ;
	}

}
