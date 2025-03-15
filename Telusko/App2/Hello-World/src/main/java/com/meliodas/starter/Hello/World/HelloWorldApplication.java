package com.meliodas.starter.Hello.World;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		Dev obj = context.getBean(Dev.class);

		System.out.println("Hello Meliodas");
		obj.build();
	}

}
