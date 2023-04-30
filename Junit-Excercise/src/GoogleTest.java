import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GoogleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddAndGet1() {
		ArrayList<String> list = new ArrayList<String>();
	    list.add("42");
	    list.add("-3");
	    list.add("17");
	    list.add("99");
	    assertEquals("42", list.get(0));
	    assertEquals("-3", list.get(1));
	    assertEquals("17", list.get(2));
	    assertEquals("99", list.get(3));

	    assertEquals("second attempt", "42", list.get(0));   // make sure I can get them a second time
	    assertEquals("second attempt", "99", list.get(3));
	}

}
