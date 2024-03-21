package com.example.the_last_dance2_api;

import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.IOException;
import java.util.Optional;


public interface NumLogRepository extends CrudRepository<Numlog, Integer> {

}
