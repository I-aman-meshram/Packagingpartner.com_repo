package com.project.packagingpartner.repositories;

import com.project.packagingpartner.models.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductByProductIDAndIsActive(Long productId, Boolean isActive);
    //Product getProductByProductIDAndIsNotActive(Long productId, Boolean isActive);
    Product getProductByProductNameContainingIgnoreCaseAndIsActive(String productName, Boolean isActive);
    List<Product> findAllByIsArchive( Boolean isArchive, Pageable pageable );
    List<Product> findAllByIsActive(Boolean isActive, Pageable pageable );

}
