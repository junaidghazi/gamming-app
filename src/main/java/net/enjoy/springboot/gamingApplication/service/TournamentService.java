package net.enjoy.springboot.gamingApplication.service;

import net.enjoy.springboot.gamingApplication.entity.Tournament;
import net.enjoy.springboot.gamingApplication.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public Tournament createTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public Tournament getTournamentDetails(Long tournamentId) {
        return tournamentRepository.findById(tournamentId).orElse(null);
    }

    public Iterable<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }
}
