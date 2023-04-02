package com.taller.grupo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class team {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "url_image")
    private String url_image;
    @Column(name = "team_chief")
    private String team_chief;
    @Column(name = "technical_chief")
    private String technical_chief;
    @Column(name = "points")
    private Integer points;
    @Column(name = "base")
    private String base;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public String getTeam_chief() {
        return team_chief;
    }

    public void setTeam_chief(String team_chief) {
        this.team_chief = team_chief;
    }

    public String getTechnical_chief() {
        return technical_chief;
    }

    public void setTechnical_chief(String technical_chief) {
        this.technical_chief = technical_chief;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
