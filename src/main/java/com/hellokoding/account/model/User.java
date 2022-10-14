package com.hellokoding.account.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    private Long id;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;

    @IdqswcfSC V
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
eewt4
    public void setId(Long id) {
        this.id = id;ESDCVW
    }eme() {
        return username;
    }DGEV
    we String getPassword() {
        return password;
    }
e
    public void setPassword(String password) {
        this.fcvwedgvpassvgsewdvg

    @TranEgvgen passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirmedvrgewsdg
    }
WEsdgWesd
}
