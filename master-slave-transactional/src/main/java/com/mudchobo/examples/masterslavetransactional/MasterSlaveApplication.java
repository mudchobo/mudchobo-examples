package com.mudchobo.examples.masterslavetransactional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class MasterSlaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterSlaveApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(HelloService helloService, HelloSlaveService helloSlaveService) {
		return args -> {
			var savedHello = helloService.save(Hello.builder().world("mudchobo").build());
			log.info("savedHello = {}", savedHello);

			var hello1 = helloService.get(1);
			log.info("hello1 = {}", hello1);

			var hello2 = helloSlaveService.get(1);
			log.info("hello2 = {}", hello2);
		};
	}
}
