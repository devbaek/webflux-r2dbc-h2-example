package com.devbaek.webfluxr2dbch2example.domain;

import org.springframework.data.annotation.Id;

public class Team {

    @Id
    private String teamId;
    private String name;

    public Team(String name) {
        this.name = name;
    }
}
