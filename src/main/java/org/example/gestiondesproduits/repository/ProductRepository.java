package org.example.gestiondesproduits.repository;

import org.example.gestiondesproduits.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainsIgnoreCaseOrCategoryContainingIgnoreCase(String keyword, String keyword1);
    Page<Product> findByNameContains(String keyword, Pageable pageable);
    @Query("select avg(p.price) from Product p")
    double avgPrice();
    @Query("select count(p) from Product p")
    long countProducts();
    @Query("select max(p.price) from Product p")
    double maxPrice();
    @Query("select min(p.price) from Product p")
    double minPrice();
    @Query("select count(distinct p.category) from Product p")
    long countCategory();
    @Query("select p.category, count(p) from Product p group by p.category")
    List<Object[]> countProductsByCategory();
}
