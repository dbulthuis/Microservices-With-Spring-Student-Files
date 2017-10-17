package com.davebulthuis.microservicesBoot.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

public class Team {
    private String name;
    private String location;
    private String mascot;
    private Set<Player> players;

    public Team() {
        super();
    }

    public Team(String location, String name, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
