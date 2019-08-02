package com.mudchobo.examples.multipledatabase.masterrepository;

import com.mudchobo.examples.multipledatabase.domain.Hello;
import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<Hello, Long> {
}
