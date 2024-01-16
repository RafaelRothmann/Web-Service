package oi.github.rafaelrothmann.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.rafaelrothmann.webService.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
