package com.davebulthuis.lab1.controllers;

import com.davebulthuis.lab1.domain.Team;
import com.davebulthuis.lab1.domain.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController  (We will be using Spring Data REST to implement the controller, so we don't want this existing controller to interfere)
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams(){
        return teamRepository.findAll();
    }
    @GetMapping("/teams/{name}")
    public Team getTeam(@PathVariable String name){
        return teamRepository.findOne(Long.parseLong(name));
    }

}


