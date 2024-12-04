package net.enjoy.springboot.gamingApplication.repository;

import net.enjoy.springboot.gamingApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}