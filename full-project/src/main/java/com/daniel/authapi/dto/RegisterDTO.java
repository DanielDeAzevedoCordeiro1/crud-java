package com.daniel.authapi.dto;

import com.daniel.authapi.model.Role;

public record RegisterDTO(String login, String email, String password, Role role) {
}
