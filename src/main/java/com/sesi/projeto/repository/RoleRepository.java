package com.sesi.projeto.repository;

import com.sesi.projeto.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long> {
}
