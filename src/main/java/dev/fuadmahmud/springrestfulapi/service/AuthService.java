package dev.fuadmahmud.springrestfulapi.service;

import dev.fuadmahmud.springrestfulapi.model.AuthRequest;
import dev.fuadmahmud.springrestfulapi.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;

@Service
public class AuthService {

    @Autowired
    AuthRepository authRepository;

    @Transactional
    public void login(AuthRequest request) {

        if (!authRepository.existsById(request.getUsername())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Username or password is not correct");
        }



    }
}
