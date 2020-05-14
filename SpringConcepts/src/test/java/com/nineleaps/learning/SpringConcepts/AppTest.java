package com.nineleaps.learning.SpringConcepts;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.nineleaps.learning.SpringConcepts.executors.RestApplication;
import com.nineleaps.learning.SpringConcepts.services.BookService;


/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(value="prod")
@ContextConfiguration(classes= {RestApplication.class},loader=AnnotationConfigContextLoader.class)
public class AppTest
{
	  
	  @Test	 
	  public void testDevDataSource() {
		  BookService service = new BookService();
		  Assert.assertNotNull(service);
		  System.out.println(service.findAllBooks());
	  }
}
