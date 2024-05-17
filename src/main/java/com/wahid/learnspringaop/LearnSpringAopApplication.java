package com.wahid.learnspringaop;

import com.wahid.learnspringaop.aopexample.business.BusinessService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private BusinessService1 businessService1;
	// constructor injection or we we can use @Authowired on top of member variable
	public LearnSpringAopApplication(BusinessService1 businessService1)
	{
		this.businessService1 = businessService1;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int max = businessService1.calculateMax();

		logger.info("Value returned is {}",max);
	}
}
