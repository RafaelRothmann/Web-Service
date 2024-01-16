package oi.github.rafaelrothmann.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.rafaelrothmann.webService.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
