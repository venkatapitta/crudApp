package com.cardsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardsapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
