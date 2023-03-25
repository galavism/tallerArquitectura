package com.taller.grupo1.Service;


import com.taller.grupo1.model.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class driverService {

    @Autowired
    private com.taller.grupo1.repository.driverRepository driverRepository;


    public List<driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public String saveDriver(driver newDriver) {
        driverRepository.save(newDriver);
        return "Realizado Correctamente";
    }

    public int updateDriver(driver newDriver, Integer id) {
        Optional<driver> driverFound = driverRepository.findById(id);
        int returnValue = 0;

        if (driverFound.isEmpty()) {
            returnValue = -1;
        } else {
            newDriver.setId_driver(id);
            driverRepository.save(newDriver);
            returnValue = 1;
        }

        return returnValue;
    }

    public int deleteDriver(Integer id) {
        int returnValue = 0;
        if (driverRepository.findById(id).isEmpty()) {
            returnValue = -1;
        } else {
            driverRepository.deleteById(id);
            returnValue = 1;
        }
        return returnValue;
    }

    public driver getDriverById(Integer id) {

        if (driverRepository.findById(id).isEmpty()) {
            return null;
        } else {
            return driverRepository.getReferenceById(id);
        }
    }

}
