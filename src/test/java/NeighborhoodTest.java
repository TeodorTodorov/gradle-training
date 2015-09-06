import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


import com.teo.neighborhood.Neighborhood;
import com.teo.neighborhood.*;


public class NeighborhoodTest {

	ArrayList<Language> lang1;
	ArrayList<Language> lang2;
	Neighborhood neighborhood;
	Human hum1;
	Human hum2;

	@Before
	public void setUp() throws Exception {
		neighborhood = new Neighborhood();
		lang1 = new ArrayList<>();
		lang1.add(Language.BABY);
		lang1.add(Language.BULGARIAN);
		lang1.add(Language.ITALY);

		// TODO: NOT HANDLING REPEATING LANGUAGES
		lang2 = new ArrayList<>();
		lang2.add(Language.BULGARIAN);
		lang2.add(Language.DRUNK);
		lang2.add(Language.ITALY);

		//
		
		 hum1 = neighborhood.addHuman(2, "Ivan", lang1);
		 hum2 = neighborhood.addHuman(18, "Gosho2", lang2);


	}

	@Test
	public void testAddHuman() {

		try {
			
			
			
			if (hum1.getAge() != 2) {
				fail("Created object age error");
			}
			if (hum1.getName() != "Ivan") {
				fail("Created object name error");
			}
			// TODO: Implement language check
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail(e.toString());
		}

	}

	@Test
	public void testGetLanguageSpeakers() {
		ArrayList<Human> babyLangSpeakers = neighborhood.getLanguageSpeakers(Language.BABY);
		if (babyLangSpeakers.size() != 1) {
			fail("Language speakers error");
		}
	}

	@Test
	public void testGetMiddleAge() {
		if (neighborhood.getMiddleAge() != 10) {
			fail("Middle age test error");
		}
	}

	@Test
	public void testGetHumanCount() {
		if (neighborhood.getInstanceCount() != 2) {
			fail("Human instance count error");
		}
	}

	@Test
	public void testGetAgeSum() {
		if (neighborhood.getAgeSum() != 20) {
			fail("Human agesum");
		}
	}

}
