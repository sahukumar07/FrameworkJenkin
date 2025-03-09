package pac1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createcontactTest() {

		String URL = System.getProperty("url", "http://localhost:8888");
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username", "admin");
		String PASSWORD = System.getProperty("password", "password");
		System.out.println("create contacttest");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		

	}

	@Test
	public void modifycontactTest() {
		System.out.println("modify contact test");

	}

}
