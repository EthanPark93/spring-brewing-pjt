package com.ethan.homebodybrewery.db.repository;

import com.ethan.homebodybrewery.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
