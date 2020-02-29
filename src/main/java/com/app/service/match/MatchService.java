package com.app.service.match;

import com.app.model.Team;

import java.util.UUID;

public interface MatchService {

    Team getMatchWinner(UUID matchId);
}
