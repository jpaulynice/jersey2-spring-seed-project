package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.repository.entity.UserEntity;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // nothing to see here
}