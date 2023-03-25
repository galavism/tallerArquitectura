package com.taller.grupo1.Service;

import com.taller.grupo1.model.driver;
import com.taller.grupo1.model.team;
import com.taller.grupo1.repository.teamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class teamService {

    @Autowired
    teamRepository teamRepository;

    public List<team> getAllTeams() {
        return teamRepository.findAll();
    }

    public String saveTeam(team newTeam) {
        teamRepository.save(newTeam);
        return "Realizado Correctamente";
    }

    public int updateTeam(team newTeam, Integer id) {
        Optional<team> driverFound = teamRepository.findById(id);
        int returnValue = 0;

        if (driverFound.isEmpty()) {
            returnValue = -1;
        } else {
            teamRepository.save(newTeam);
            returnValue = 1;
        }

        return returnValue;
    }

    public int deleteTeam(Integer id) {
        int returnValue = 0;
        if (teamRepository.findById(id).isEmpty()) {
            returnValue = -1;
        } else {
            teamRepository.deleteById(id);
            returnValue = 1;
        }
        return returnValue;
    }

    public team getTeamById(Integer id) {

        if (teamRepository.findById(id).isEmpty()) {
            return null;
        } else {
            return teamRepository.getReferenceById(id);
        }
    }


}
