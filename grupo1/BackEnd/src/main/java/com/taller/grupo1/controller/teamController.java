package com.taller.grupo1.controller;

import com.taller.grupo1.Service.teamService;
import com.taller.grupo1.model.driver;
import com.taller.grupo1.model.team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/F1Teams")
public class teamController {

    @Autowired
    teamService teamService;


    @GetMapping("/teams")
    public ResponseEntity<List<team>> getAllTeams() {
        return new ResponseEntity<>(teamService.getAllTeams(), HttpStatus.OK);
    }

    @PutMapping("/team/{id}")
    public ResponseEntity<String> updateDriver(@PathVariable int id, @RequestBody team team) {
        int returnValue = 0;
        returnValue = teamService.updateTeam(team, id);
        if (returnValue == 1) {
            return new ResponseEntity<>("Se ha modificado correctamente", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Vuelva a intentarlo", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/team")
    public ResponseEntity<String> newDriver(@RequestBody team newTeam) {
        return new ResponseEntity<>(teamService.saveTeam(newTeam), HttpStatus.OK);
    }

    @DeleteMapping("/team/{id}")
    public ResponseEntity<String> deletDriver(@PathVariable int id) {
        int returnValue = 0;
        returnValue = teamService.deleteTeam(id);
        if (returnValue == -1) {
            return new ResponseEntity<>("Id no encontrado", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>("Se ha eliminado con exito", HttpStatus.OK);
        }
    }

    @GetMapping("/team/{id}")
    public ResponseEntity<team> getOneDriver(@PathVariable int id) {
        team teamFound = teamService.getTeamById(id);
        if (teamService.getTeamById(id) == null) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(teamFound, HttpStatus.OK);
        }
    }


    @GetMapping("/teamName/{id}")
    public String teamName(@PathVariable Integer  id){
        team teamFound=teamService.getTeamById(id);
        return teamFound.getName();
    }


}
