package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
/*
"message": "Validation failed for argument [0] in public org.springframework.http.ResponseEntity<java.lang.Object> com.in28minutes.rest.webservices.restfulwebservices.user.UserResource.createUser(com.in28minutes.rest.webservices.restfulwebservices.user.User)
with 2 errors: [Field error in object 'user' on field 'name': rejected value [d];
codes [Size.user.name,Size.name,Size.java.lang.String,Size];
arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [user.name,name];
arguments []; default message [name],2147483647,2]; default message [Name should have at least two characters]]
[Field error in object 'user' on field 'birthDate': rejected value [2043-05-15];
codes [Past.user.birthDate,Past.birthDate,Past.java.time.LocalDate,Past];
arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [user.birthDate,birthDate];
 arguments []; default message [birthDate]]; default message [The birthdate should be in the past ]] ",

 */