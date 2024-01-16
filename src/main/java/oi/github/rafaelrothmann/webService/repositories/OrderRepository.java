package oi.github.rafaelrothmann.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.rafaelrothmann.webService.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
}
