package test.service;

import org.junit.Test;


import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Commentaire;
import fr.cap.wikimnv.global.domain.pojo.Profil;
import fr.cap.wikimnv.global.domain.pojo.Template;
import fr.cap.wikimnv.global.service.IServiceCommentaire;
import fr.cap.wikimnv.global.service.impl.ServiceCommentaireImpl;




public class IServiceCommentaireTest {

	IServiceCommentaire Gcommentaire = new ServiceCommentaireImpl();
	Profil profil = new Profil() ;
	Template template = new Template("NomTest") ;
	Commentaire commentaire = new Commentaire(profil, template) ;
	
	@Test
	public void testLister() throws MNVException {
		Gcommentaire.lister(null) ;
	}

	@Test
	public void testLire() throws MNVException {
		Gcommentaire.lire(commentaire, null) ;
	}

	@Test
	public void testSauver() throws MNVException {
		Gcommentaire.sauver(commentaire) ;
	}

	@Test
	public void testSupprimer() throws MNVException {
		Gcommentaire.supprimer(commentaire);
	}

	@Test
	public void testBanir() throws MNVException {
		Gcommentaire.banir(commentaire, null);
		
	}

}
