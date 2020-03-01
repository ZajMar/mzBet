package com.app.service.team;

import com.app.model.team.FootballTeam;
import com.app.model.team.Team;
import com.app.model.team.TeamType;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class FootballTeamService implements TeamService {

    @Override
    public boolean isForMe(TeamType teamType) {
        return false;
    }

    @Override
    public Optional<Team> getTeam(UUID teamId) {
        return Optional.of(FootballTeam.builder().id(UUID.randomUUID()).name("FootballTeam").build());
    }
}
