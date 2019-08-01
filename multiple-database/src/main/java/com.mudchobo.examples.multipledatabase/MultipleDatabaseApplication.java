package com.mudchobo.examples.multipledatabase;

import com.mudchobo.examples.multipledatabase.domain.Hello;
import com.mudchobo.examples.multipledatabase.masterrepository.HelloRepository;
import com.mudchobo.examples.multipledatabase.slaverepository.HelloSlaveRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@EnableTransactionManagement
@SpringBootApplication
public class MultipleDatabaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultipleDatabaseApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(HelloRepository helloRepository, HelloSlaveRepository helloSlaveRepository) {
        return args -> {
            var savedHello = helloRepository.save(Hello.builder().world("mudchobo").build());
            log.info("savedHello = {}", savedHello);

            var masterHello = helloRepository.findById(1L);
            log.info("masterHello = {}", masterHello);

            var slaveHello = helloSlaveRepository.findById(1L);
            log.info("slaveHello = {}", slaveHello);
        };
    }
}
