package com.taller.grupo1.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="driver")
public class driver {

    @Id
    @Column(name = "id_driver")
    private Integer id_driver;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name="points")
    private Integer points;
    @Column(name = "date_of_birth")
    private String date_of_birth;
    @Column(name="id_team")
    private Integer id_team;
    @Column(name = "url_image")
    private  String url_image;

    public Integer getId_driver() {
        return id_driver;
    }

    public void setId_driver(Integer id_driver) {
        this.id_driver = id_driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Integer getId_team() {
        return id_team;
    }

    public void setId_team(Integer id_team) {
        this.id_team = id_team;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }
}
