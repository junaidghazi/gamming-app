package net.enjoy.springboot.gamingApplication.repository;

import net.enjoy.springboot.gamingApplication.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
