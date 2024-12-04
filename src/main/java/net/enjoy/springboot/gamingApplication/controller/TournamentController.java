package net.enjoy.springboot.gamingApplication.controller;

import net.enjoy.springboot.gamingApplication.entity.Tournament;
import net.enjoy.springboot.gamingApplication.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping
    public Tournament createTournament(@RequestBody Tournament tournament) {
        return tournamentService.createTournament(tournament);
    }

    @GetMapping
    public Iterable<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/{id}")
    public Tournament getTournamentDetails(@PathVariable Long id) {
        return tournamentService.getTournamentDetails(id);
    }
}
