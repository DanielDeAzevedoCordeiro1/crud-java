package com.daniel.authapi.services;

import com.daniel.authapi.dto.RegisterDTO;
import com.daniel.authapi.model.User;
import com.daniel.authapi.repository.UserRepository;
import com.daniel.authapi.util.UserFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserFactory userFactory;
    private final UserRepository userRepository;

    public UserService(UserFactory userFactory, UserRepository userRepository) {
        this.userFactory = userFactory;
        this.userRepository = userRepository;
    }

    public User register(RegisterDTO registerDTO) throws Exception {
        var exists = userRepository.findByLogin(registerDTO.login());
        if (exists != null) throw new Exception("Usuario existente");
        var newUser = userFactory.createUser(registerDTO);
        userRepository.save(newUser);
        return newUser;
    }
}
