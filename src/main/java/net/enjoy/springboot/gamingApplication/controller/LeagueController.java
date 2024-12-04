package net.enjoy.springboot.gamingApplication.controller;

import net.enjoy.springboot.gamingApplication.entity.Match;
import net.enjoy.springboot.gamingApplication.entity.Team;
import net.enjoy.springboot.gamingApplication.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/league")
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    // Endpoint to update standings after a match
    @PostMapping("/updateStandings")
    public String updateStandings(@RequestBody Match match) {
        return leagueService.updateStandings(match); // Returns a message confirming the update
    }

    // Endpoint to fetch current standings
    @GetMapping("/standings")
    public Iterable<Team> getStandings() {
        return leagueService.getStandings(); // Returns all teams with updated standings
    }

    // Endpoint to get match details by match ID
    @GetMapping("/match/{matchId}")
    public Match getMatchDetails(@PathVariable Long matchId) {
        return leagueService.getMatchDetails(matchId); // Returns match details for the given match ID
    }
}
