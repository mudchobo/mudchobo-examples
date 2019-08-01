package com.mudchobo.examples.multipledatabase.slaverepository;

import com.mudchobo.examples.multipledatabase.domain.Hello;
import org.springframework.data.repository.CrudRepository;

public interface HelloSlaveRepository extends CrudRepository<Hello, Long> {
}
