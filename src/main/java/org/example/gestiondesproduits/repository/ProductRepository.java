package org.example.gestiondesproduits.repository;

import org.example.gestiondesproduits.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
