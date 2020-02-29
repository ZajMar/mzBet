package com.app.dao.Match;

import com.app.model.Match;

import java.util.UUID;

public interface MatchDao {

    Match getMatch(UUID id);
}
