package com.project.packagingpartner.repositories;

import com.project.packagingpartner.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
    //User findByUserID(Long userId);
}
