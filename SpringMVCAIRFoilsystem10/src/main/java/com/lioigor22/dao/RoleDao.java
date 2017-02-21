package com.lioigor22.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lioigor22.objects.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

}
