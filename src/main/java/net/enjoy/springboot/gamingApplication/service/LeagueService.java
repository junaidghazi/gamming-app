package net.enjoy.springboot.gamingApplication.service;

import net.enjoy.springboot.gamingApplication.entity.Match;
import net.enjoy.springboot.gamingApplication.entity.Team;
import net.enjoy.springboot.gamingApplication.repository.MatchRepository;
import net.enjoy.springboot.gamingApplication.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private TeamRepository teamRepository;

    // Method to update standings and return updated teams
    public String updateStandings(Match match) {
        Team team1 = match.getTeam1();
        Team team2 = match.getTeam2();

        // Points calculation based on match result
        int pointsForTeam1 = calculatePoints(match.getTeam1Score(), match.getTeam2Score());
        int pointsForTeam2 = calculatePoints(match.getTeam2Score(), match.getTeam1Score());

        // Update the goals scored, goals conceded, and goal difference
        team1.setGoalsScored(team1.getGoalsScored() + match.getTeam1Score());
        team1.setGoalsConceded(team1.getGoalsConceded() + match.getTeam2Score());
        team1.setGoalDifference(team1.getGoalsScored() - team1.getGoalsConceded());
        team2.setGoalsScored(team2.getGoalsScored() + match.getTeam2Score());
        team2.setGoalsConceded(team2.getGoalsConceded() + match.getTeam1Score());
        team2.setGoalDifference(team2.getGoalsScored() - team2.getGoalsConceded());

        // Update points
        team1.setPoints(team1.getPoints() + pointsForTeam1);
        team2.setPoints(team2.getPoints() + pointsForTeam2);

        // Save the updated teams in the database
        teamRepository.save(team1);
        teamRepository.save(team2);

        // Save the match details
        matchRepository.save(match);

        return "Standings updated successfully for " + team1.getName() + " and " + team2.getName() + ".";
    }

    // Helper method to calculate points based on match result
    private int calculatePoints(int teamScore, int opponentScore) {
        if (teamScore > opponentScore) {
            return 3; // Win
        } else if (teamScore == opponentScore) {
            return 1; // Draw
        } else {
            return 0; // Loss
        }
    }

    // Method to get team standings
    public Iterable<Team> getStandings() {
        // Get all teams sorted by points, goal difference, etc.
        return teamRepository.findAll();
    }

    // Method to get match details by ID
    public Match getMatchDetails(Long matchId) {
        return matchRepository.findById(matchId).orElse(null); // Returns match if found
    }
}
