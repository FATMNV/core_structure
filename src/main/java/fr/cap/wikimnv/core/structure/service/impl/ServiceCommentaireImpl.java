package fr.cap.wikimnv.core.structure.service.impl;

import java.util.List;
import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.persistance.CrudService;
import fr.cap.wikimnv.core.persistance.CrudService_Service;
import fr.cap.wikimnv.core.persistance.MNVException_Exception;
import fr.cap.wikimnv.core.persistance.cli.PersistanceCli;
import fr.cap.wikimnv.core.pojo.Commentaire;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.TypeStructure;
import fr.cap.wikimnv.core.structure.service.IServiceCommentaire;


public class ServiceCommentaireImpl implements IServiceCommentaire {
	PersistanceCli sCrud ;
	  
	
	public ServiceCommentaireImpl() {		
	}
	
	/**
	 * Permet d'obtenir la liste de tous les commentaires
	 *@return  Renvoie la liste des comentaires
	 *@author  Sohail, Messan  
	 * @throws MNVException_Exception 
	 */ 
	
	public List<Object> lister() throws MNVException, MNVException_Exception {
		
		return  sCrud.lister(TypeStructure.COMMENTAIRE );
	}
	
	/**
	 * Permet de chargé un commentaire depuis la base
	 * @param Le commentaire à lire
	 * @return  Renvoie le commentaire demandé en paramètre
	 * @author Sohail, Messan
	 * @throws MNVException_Exception 
	 */ 

	
	public Object lire(Object commentaire) throws MNVException, MNVException_Exception {
		return sCrud.lire(commentaire, TypeStructure.COMMENTAIRE) ;
	}
	
	/**
	 * Permet de sauvegarde un commentaire
	 * @param Le commentaire à sauvegarder
	 * @return le commentaire passé en paramètre après le sauvegarde
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */ 

	
	public Object sauver(Object commentaire) throws MNVException {
		try {
			return sCrud.sauver(commentaire) ;
		} catch (MNVException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commentaire;
	}
	
	/**
	 * Supprime le commentaire depuis la base passé en paramètre
	 * @param le commentaire à supprimer
	 * @return le commentaire supprimé 
	 * @author Sohail, Messan
	 * @throws MNVException 
	 * @throws MNVException_Exception 
	 */

	
	public Commentaire supprimer(Commentaire commentaire) throws MNVException, MNVException_Exception {
		return (Commentaire) sCrud.supprimer(commentaire) ;
	}

	/**
	 * Permet de publier ou dépublier un commentaire
	 * @param le commentaire à banir
	 * @return le commentaire banis
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */
	
	
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) throws MNVException {
		// Publie ou dépublie un commentaire
		commentaire.setEtat(etat);
		return (Commentaire) sauver(commentaire) ;
	}

	
	public Set<?> lister(Class cls) throws MNVException {
		
		return null;
	}

	
	public Object lire(Object obj, Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return null;
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
	