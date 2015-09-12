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
	 * Permet de charg� un commentaire depuis la base
	 * @param Le commentaire � lire
	 * @return  Renvoie le commentaire demand� en param�tre
	 * @author Sohail, Messan
	 * @throws MNVException_Exception 
	 */ 

	
	public Object lire(Object commentaire) throws MNVException, MNVException_Exception {
		return sCrud.lire(commentaire, TypeStructure.COMMENTAIRE) ;
	}
	
	/**
	 * Permet de sauvegarde un commentaire
	 * @param Le commentaire � sauvegarder
	 * @return le commentaire pass� en param�tre apr�s le sauvegarde
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
	 * Supprime le commentaire depuis la base pass� en param�tre
	 * @param le commentaire � supprimer
	 * @return le commentaire supprim� 
	 * @author Sohail, Messan
	 * @throws MNVException 
	 * @throws MNVException_Exception 
	 */

	
	public Commentaire supprimer(Commentaire commentaire) throws MNVException, MNVException_Exception {
		return (Commentaire) sCrud.supprimer(commentaire) ;
	}

	/**
	 * Permet de publier ou d�publier un commentaire
	 * @param le commentaire � banir
	 * @return le commentaire banis
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */
	
	
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) throws MNVException {
		// Publie ou d�publie un commentaire
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
	