package com.app.model.team;

import lombok.Builder;

import java.util.UUID;

@Builder
public class LoLTeam implements Team {

    private String name;
    private UUID id;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
