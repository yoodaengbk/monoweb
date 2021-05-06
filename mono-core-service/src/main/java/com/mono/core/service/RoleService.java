package com.mono.core.service;

import com.mono.core.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> findAll();
}
