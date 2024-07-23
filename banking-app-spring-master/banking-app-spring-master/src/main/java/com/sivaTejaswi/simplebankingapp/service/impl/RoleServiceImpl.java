package com.sivaTejaswi.simplebankingapp.service.impl;

import com.sivaTejaswi.simplebankingapp.domain.entity.Role;
import com.sivaTejaswi.simplebankingapp.repository.RoleRepository;
import com.sivaTejaswi.simplebankingapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
