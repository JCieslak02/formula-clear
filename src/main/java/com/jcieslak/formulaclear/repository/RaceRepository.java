package com.jcieslak.formulaclear.repository;

import com.jcieslak.formulaclear.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Integer>{
    List<Race> findAllByYearGreaterThanEqual(int year);
}
