package com.taller.grupo1.repository;

import com.taller.grupo1.model.team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//DAO use
@Repository
public interface teamRepository extends JpaRepository<team, Integer> {

}
