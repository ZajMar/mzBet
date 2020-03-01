package com.app.model.team;

public class LoLTeam implements Team {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
