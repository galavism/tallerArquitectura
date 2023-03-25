package com.taller.grupo1.controller;


import com.taller.grupo1.Service.driverService;
import com.taller.grupo1.model.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/F1Drivers")
public class driverController {

    @Autowired
    com.taller.grupo1.Service.driverService driverService;

    @GetMapping("/drivers")
    public ResponseEntity<List<driver>> getAllDrivers() {
        return new ResponseEntity<>(driverService.getAllDrivers(), HttpStatus.OK);
    }

    @PutMapping("/driver/{id}")
    public ResponseEntity<String> updateDriver(@PathVariable int id, @RequestBody driver driver) {
        int returnValue = 0;
        returnValue = driverService.updateDriver(driver, id);
        if (returnValue == 1) {
            return new ResponseEntity<>("Se ha modificado correctamente", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Vuelva a intentarlo", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/driver")
    public ResponseEntity<String> newDriver(@RequestBody driver newDriver) {
        return new ResponseEntity<>(driverService.saveDriver(newDriver), HttpStatus.OK);
    }

    @DeleteMapping("/driver/{id}")
    public ResponseEntity<String> deletDriver(@PathVariable int id) {
        int returnValue = 0;
        returnValue = driverService.deleteDriver(id);
        if (returnValue == -1) {
            return new ResponseEntity<>("Id no encontrado", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>("Se ha eliminado con exito", HttpStatus.OK);
        }
    }

    @GetMapping("/driver/{id}")
    public ResponseEntity<driver> getOneDriver(@PathVariable int id) {
        driver driverFound = driverService.getDriverById(id);
        if (driverService.getDriverById(id) == null) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(driverFound, HttpStatus.OK);
        }

    }


}

