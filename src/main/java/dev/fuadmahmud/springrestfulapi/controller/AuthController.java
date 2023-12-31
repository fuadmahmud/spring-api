package dev.fuadmahmud.springrestfulapi.controller;

import dev.fuadmahmud.springrestfulapi.model.AuthRequest;
import dev.fuadmahmud.springrestfulapi.model.WebResponse;
import dev.fuadmahmud.springrestfulapi.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(path = "/auth/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<String> login(@RequestBody AuthRequest request) {
        authService.login(request);
        return WebResponse.<String>builder().data("OK").build();
    }
}
