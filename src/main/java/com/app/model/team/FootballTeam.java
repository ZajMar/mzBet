package com.app.model.team;

import lombok.Builder;

import java.util.UUID;

@Builder
public class FootballTeam implements Team {

    private String name;
    private UUID id;

    @Override
    public String getName() {
        return "Football Team";
    }
}
