package com.classroom.iocproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IocprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(IocprojectApplication.class, args);
		emailRenderer emailren =  container.getBean(emailRenderer.class);
		emailren.doemailrendering();
	}


}
