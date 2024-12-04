package net.enjoy.springboot.gamingApplication.repository;

import net.enjoy.springboot.gamingApplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}