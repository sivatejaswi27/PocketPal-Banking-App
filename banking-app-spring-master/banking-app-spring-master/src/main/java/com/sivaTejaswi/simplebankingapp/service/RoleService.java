package com.sivaTejaswi.simplebankingapp.service;

import com.sivaTejaswi.simplebankingapp.domain.entity.Role;

public interface RoleService {

    Role findByRoleName(String roleName);
}
