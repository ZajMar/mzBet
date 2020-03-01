package com.app.service.match;

import com.app.model.team.Team;

import java.util.UUID;

public interface MatchService {

    Team getMatchWinner(UUID matchId);
}
