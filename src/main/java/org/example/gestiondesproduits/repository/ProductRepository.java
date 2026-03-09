package org.example.gestiondesproduits.repository;

import org.example.gestiondesproduits.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainsIgnoreCaseOrCategoryContainingIgnoreCase(String keyword, String keyword1);
    Page<Product> findByNameContains(String keyword, Pageable pageable);
}
