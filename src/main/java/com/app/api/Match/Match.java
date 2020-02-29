package com.app.api.Match;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/match")
public class Match {

    @Autowired
    private MatchDao matchDao;

}
