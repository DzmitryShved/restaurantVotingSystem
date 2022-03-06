/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outlook.rennands.restaurantVotingSystem.model;

import java.time.Instant;
import java.util.Set;

/**
 *
 * @author Dmitry Shved
 */
public class User extends AbstractNamedEntity {

    private String email;

    private String password;
    
    private boolean enabled = true;

    private Instant registred = Instant.now();
    
    private Set<Role> roles;
    
    private Vote vote;

}
