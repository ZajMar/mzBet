package com.app.dao.match;

import com.app.model.match.Match;

import java.util.UUID;

public interface MatchDao {

    Match getMatch(UUID id);
}
