package com.mudchobo.examples.masterslavetransactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@Service
public class HelloSlaveService {
    private final HelloRepository helloRepository;

    public HelloSlaveService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Optional<Hello> get(long id) {
        return helloRepository.findById(id);
    }
}
