package com.davebulthuis.microservicesBoot.controller;


import com.davebulthuis.microservicesBoot.domain.Player;
import com.davebulthuis.microservicesBoot.domain.Team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class MSController {

    private Team team;
    @PostConstruct
    public void init(){

        Set<Player> players = new HashSet<>();
        players.add(new Player("Charlie Brown","pitcher"));
        players.add(new Player("Snoopy","SS"));

        team = new Team("California","Peanuts",players);

    }

    @RequestMapping("/hi")
    public @ResponseBody Team hiThere(){
        return team;
    }
}
