package com.app.api.team;

import com.app.model.team.Team;
import com.app.service.team.TeamService;
import com.app.service.team.TeamServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/team")
public class TeamApi {

    @Autowired
    private TeamServiceController teamServiceController;

    @GetMapping
    public Team getTeam(UUID teamId) {
        return teamServiceController.getTeam(teamId);
    }
}
