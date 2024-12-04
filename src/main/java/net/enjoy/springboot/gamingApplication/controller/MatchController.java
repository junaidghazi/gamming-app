package net.enjoy.springboot.gamingApplication.controller;

import net.enjoy.springboot.gamingApplication.entity.Match;
import net.enjoy.springboot.gamingApplication.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/{id}/result")
    public Match updateMatchResult(@PathVariable Long id, @RequestParam int team1Score, @RequestParam int team2Score) {
        return matchService.updateMatchResult(id, team1Score, team2Score);
    }

    @GetMapping("/{id}")
    public Match getMatchDetails(@PathVariable Long id) {
        return matchService.getMatchDetails(id);
    }
}
