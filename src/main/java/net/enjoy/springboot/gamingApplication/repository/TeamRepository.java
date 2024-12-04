package net.enjoy.springboot.gamingApplication.repository;

import net.enjoy.springboot.gamingApplication.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
