package com.in28minutes.rest.webservices.restfulwebservices;

import com.in28minutes.rest.webservices.restfulwebservices.user.Post;
import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserJpaResource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class RestfulWebServicesApplicationTests {

	@Autowired
	UserJpaResource userJpaResource;
	@Test
	void testSave() {
		User user = new User();
		user.setName("Aaaaa");
		user.setBirthDate(LocalDate.now().minusYears(30));
		user.setId(25);
		userJpaResource.createUser(user);


	}

}
