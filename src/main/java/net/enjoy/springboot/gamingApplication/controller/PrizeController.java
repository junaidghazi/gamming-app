package net.enjoy.springboot.gamingApplication.controller;

import net.enjoy.springboot.gamingApplication.entity.Team;
import net.enjoy.springboot.gamingApplication.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prizes")
public class PrizeController {

    @Autowired
    private PrizeService prizeService;

    @PostMapping("/distribute")
    public String distributePrize(@RequestBody Team team, @RequestParam int prizeAmount) {
        prizeService.distributePrize(team, prizeAmount);
        return "Prize distributed to " + team.getName();
    }
}
