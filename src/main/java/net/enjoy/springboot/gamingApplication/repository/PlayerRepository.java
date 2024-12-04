package net.enjoy.springboot.gamingApplication.repository;

import net.enjoy.springboot.gamingApplication.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
