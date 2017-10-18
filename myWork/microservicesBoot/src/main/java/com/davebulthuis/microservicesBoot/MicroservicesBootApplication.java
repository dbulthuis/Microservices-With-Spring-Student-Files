package com.davebulthuis.microservicesBoot;

import com.davebulthuis.microservicesBoot.dao.TeamDao;
import com.davebulthuis.microservicesBoot.domain.Player;
import com.davebulthuis.microservicesBoot.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

    // This method is run when running as a JAR
    public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	// This method is run when running as a WAR
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroservicesBootApplication.class);
    }

    private Team team;
    @PostConstruct
    public void init(){

        Set<Player> players = new HashSet<>();
        players.add(new Player("Charlie Brown","pitcher"));
        players.add(new Player("Snoopy","SS"));

        team = new Team("California","Peanuts",players);

        teamDao.save(team);
    }
    @Autowired
    TeamDao teamDao;
}
