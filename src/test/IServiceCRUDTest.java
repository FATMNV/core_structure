package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Article;
import fr.cap.wikimnv.global.service.IServiceCRUD;

public class IServiceCRUDTest {
	
	
	IServiceCRUD serviceCRUD;
	
	
	
	// constructeur
	public IServiceCRUDTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		serviceCRUD = (IServiceCRUD) applicationContext.getBean("sCrud");		
	}
	
	

	@Test
	public void testLister() {
		try {
			serviceCRUD.lister(Article.class);
		} catch (MNVException e) {
			fail(e.getCodeErreur() + e.getMessage());
		}
	}

	@Test
	public void testLire() {
		try {
			Article  a = new Article(null, null);
			serviceCRUD.lire(a, Article.class);
		} catch (MNVException e) {
			fail(e.getCodeErreur() + e.getMessage());
		}
	}

	@Test
	public void testSupprimer() {
		try {
			serviceCRUD.supprimer(Article.class);
		} catch (MNVException e) {
			fail(e.getCodeErreur() + e.getMessage());
		}
	}

	@Test
	public void testSauver() {
		try {
			serviceCRUD.sauver(Article.class);
		} catch (MNVException e) {
			fail(e.getCodeErreur() + e.getMessage());
		}
	}

}
