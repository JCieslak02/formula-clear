package com.jcieslak.formulaclear.service;

import com.jcieslak.formulaclear.model.Race;
import com.jcieslak.formulaclear.repository.RaceRepository;
import com.jcieslak.formulaclear.repository.ResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceService {
    private final RaceRepository raceRepository;
    private final ResultRepository resultRepository;
    // Imo this is a great year to start getting relevant data 
    public static final int FINISHERS_STARTING_YEAR = 2007;

    private void calculateAndSetRaceClassified(Race race) {
        int finishers = resultRepository.countByRaceIdAndPositionIsNotNull(race.getId());
        race.setFinishers(finishers);
        raceRepository.save(race);
    }

    public void calculateAllRacesClassified() {
        List<Race> raceList = raceRepository.findAllByYearGreaterThanEqual(FINISHERS_STARTING_YEAR);
        raceList.forEach(this::calculateAndSetRaceClassified);
    }

}
