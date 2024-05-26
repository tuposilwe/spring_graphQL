package com.rudiger.springboot_graphQL.model;

public record Player(
        Integer Id,
        String name,
        Team team
) {

}
