package com.project.packagingpartner.repositories;

import com.project.packagingpartner.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findAllByUserId(Long userId);
    List<Cart> findAllByUserIdAndIsOrder(Long userId, Boolean isOrder);

    //List<Cart> findAllProductAndIsOrder(Boolean isOrder);
}
