package net.enjoy.springboot.gamingApplication.service;

import net.enjoy.springboot.gamingApplication.entity.Team;
import org.springframework.stereotype.Service;

@Service
public class PrizeService {

    public void distributePrize(Team team, int prizeAmount) {
        // Logic to distribute prize
        System.out.println("Prize of " + prizeAmount + " awarded to " + team.getName());
    }
}
