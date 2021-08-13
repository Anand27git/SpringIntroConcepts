package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.demo.springconcepts.component.DemoBean;

@SpringBootApplication
public class SpringConceptsApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Checking ContextDebug: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
	}
}