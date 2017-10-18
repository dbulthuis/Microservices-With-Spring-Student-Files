package com.davebulthuis.lab1;

import com.davebulthuis.lab1.domain.Player;
import com.davebulthuis.lab1.domain.Team;
import com.davebulthuis.lab1.domain.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Lab1Application {

	@Autowired
    private TeamRepository teamRepository;

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Set<Player> set = new HashSet<>();
        set.add(new Player("Big Easy", "Showman"));
        set.add(new Player("Buckets", "Guard"));
        set.add(new Player("Dizzy", "Guard"));

        Team team = new Team();
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        team.setPlayers(set);

        list.add(team);

        set = new HashSet<>();
        set.add(new Player("Crash", "Showman"));
        set.add(new Player("Dude", "Guard"));
        set.add(new Player("Lebron", "Guard"));

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        team.setPlayers(set);
        list.add(team);

        set = new HashSet<>();
        set.add(new Player("Luc", "Center"));
        set.add(new Player("Rodman", "Guard"));
        set.add(new Player("Jordan", "Guard"));
        team = new Team();
        team.setLocation("Chicago");
        team.setName("Bulls");
        team.setPlayers(set);
        list.add(team);

        teamRepository.save(list);
    }
    public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
}
