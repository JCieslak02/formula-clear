package com.jcieslak.formulaclear.repository;

import com.jcieslak.formulaclear.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
    int countByRaceIdAndPositionIsNotNull(int raceId);
}
