package com.mudchobo.examples.masterslavetransactional;

import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<Hello, Long> {
}
