package net.enjoy.springboot.gamingApplication.service;

import net.enjoy.springboot.gamingApplication.entity.Match;
import net.enjoy.springboot.gamingApplication.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public Match updateMatchResult(Long matchId, int team1Score, int team2Score) {
        Match match = matchRepository.findById(matchId).orElse(null);
        if (match != null) {
            match.setTeam1Score(team1Score);
            match.setTeam2Score(team2Score);
            return matchRepository.save(match);
        }
        return null;
    }

    public Match getMatchDetails(Long matchId) {
        return matchRepository.findById(matchId).orElse(null);
    }
}
