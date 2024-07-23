package com.sivaTejaswi.simplebankingapp.repository;

import com.sivaTejaswi.simplebankingapp.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
