package com.hellokoding.account.model;

import javax.persistence.*;
import java.util.Set;
hbaercfbh rtv cdf
@Entity
@Table(name = "role")
public class Rofgdf bzddfbhadrfble {
    private Long id;
    private String name;
    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() 
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
dfbc fb dfcbcfthbaf
fbhdzefbn         return name;
    }efbaEbf

    public void setName(String name) {
        this.name = name;
    } c
    @ManyToMany(mapEFb B c

    public void setUsersfbaefsb(Set<User> users) {
        this.users = users;
    }fbdefrhaetrhfae
}
