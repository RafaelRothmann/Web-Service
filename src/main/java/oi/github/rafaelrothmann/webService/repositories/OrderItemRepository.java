package oi.github.rafaelrothmann.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.rafaelrothmann.webService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
    
}
