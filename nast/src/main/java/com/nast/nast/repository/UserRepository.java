package com.nast.nast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nast.nast.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
