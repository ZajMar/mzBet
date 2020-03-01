package com.app.service.team;

import com.app.model.team.Team;
import com.app.service.exception.DuplicateException;
import com.app.service.team.TeamService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TeamServiceController {

    @Autowired
    private List<TeamService> teamServices;

    public Team getTeam(UUID teamId) {
        Set<Team> teamsById = teamServices.stream()
                .map(teamService -> teamService.getTeam(teamId))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());

        if (teamsById.isEmpty()) {
            return new HttpClientErrorException.NotFound("Not found exception");
        }
        if(teamsById.size()!=1){
            throw new DuplicateException("Duplicate for provided id exist.");
        }
        return teamsById.iterator().next();
    }
}
