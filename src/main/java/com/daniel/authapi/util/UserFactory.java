package com.daniel.authapi.util;

import com.daniel.authapi.dto.RegisterDTO;
import com.daniel.authapi.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {
    private final PasswordEncoder passwordEncoder;

    public UserFactory(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(RegisterDTO registerDTO) {
        String encodedPassword = passwordEncoder.encode(registerDTO.password());
        return new User(registerDTO.login(), registerDTO.email(), encodedPassword, registerDTO.role());
    }

    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }
}
