package com.taller.grupo1.repository;

import com.taller.grupo1.model.driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//DAO use
@Repository
public interface driverRepository extends JpaRepository<driver,Integer> {

}