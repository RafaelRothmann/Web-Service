package oi.github.rafaelrothmann.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.rafaelrothmann.webService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    
}
