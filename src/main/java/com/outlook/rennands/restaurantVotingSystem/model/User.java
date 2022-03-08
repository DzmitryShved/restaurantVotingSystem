/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outlook.rennands.restaurantVotingSystem.model;

import java.time.Instant;
import java.util.Set;
import javax.persistence.Entity;

/**
 *
 * @author Dmitry Shved
 */
@Entity
public class User extends AbstractNamedEntity {

    private String email;

    private String password;

    private boolean enabled = true;

    private Instant registred = Instant.now();

    private Set<Role> roles;

    private Vote vote;

    public User() {
    }

    public User(String email, String password, Set<Role> roles, Vote vote, String name) {
        super(name);
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.vote = vote;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Instant getRegistred() {
        return registred;
    }

    public void setRegistred(Instant registred) {
        this.registred = registred;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + 
                ", name=" + name + 
                ", email=" + email + 
                ", password=" + password + 
                ", enabled=" + enabled + 
                ", registred=" + registred + 
                ", roles=" + roles + 
                ", vote=" + vote + '}';
    }
    
    

}
