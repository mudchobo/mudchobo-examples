package com.mudchobo.examples.masterslavetransactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Optional<Hello> get(long id) {
        return helloRepository.findById(id);
    }

    public Hello save(Hello hello) {
        return helloRepository.save(hello);
    }
}
