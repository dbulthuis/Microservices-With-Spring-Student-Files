package com.davebulthuis.microservicesBoot.dao;

import com.davebulthuis.microservicesBoot.domain.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamDao extends CrudRepository<Team, Long> {

    List<Team> findAll();

    Team findByName(String name);
}
