package com.app.service.team;

import com.app.model.team.LoLTeam;
import com.app.model.team.Team;
import com.app.model.team.TeamType;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class LoLTeamService implements TeamService{

    @Override
    public boolean isForMe(TeamType teamType) {
        return false;
    }

    @Override
    public Optional<Team> getTeam(UUID teamId) {
        return Optional.of(LoLTeam.builder().name("example name").id(UUID.randomUUID()).build());
    }
}
