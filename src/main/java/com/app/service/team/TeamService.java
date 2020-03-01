package com.app.service.team;

import com.app.model.team.Team;
import com.app.model.team.TeamType;

import java.util.Optional;
import java.util.UUID;

public interface TeamService {

    boolean isForMe(TeamType teamType);

    Optional<Team> getTeam(UUID teamId);
}
