package com.davebulthuis.microservicesBoot.controller;


import com.davebulthuis.microservicesBoot.dao.TeamDao;
import com.davebulthuis.microservicesBoot.domain.Player;
import com.davebulthuis.microservicesBoot.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestController
public class MSController {

    @Autowired
    TeamDao teamDao;

    @RequestMapping("/teams/{name}")
    public Team returnTeam(@PathVariable String name){
        return teamDao.findByName(name);
    }
}
