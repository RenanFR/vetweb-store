package vetweb.store.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import vetweb.store.entity.Category;

@RunWith(SpringRunner.class)//Integration with JUnit
@DataJpaTest//Enables in memory database with h2database
public class EntityTests {
	
	@Autowired
	private TestEntityManager testEntityManager;//Mock in memory alternative for EntityManager
	
	@Test
	public void persistTest() {
		Category category = new Category();
		category.setDescription("CATEGORY");
		Category founded = testEntityManager.persistFlushFind(category);
		System.out.println("Category created " + founded);
		assertTrue(founded.getId() != null);
	}

}