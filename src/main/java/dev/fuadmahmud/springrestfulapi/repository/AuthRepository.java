package dev.fuadmahmud.springrestfulapi.repository;

import dev.fuadmahmud.springrestfulapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<User, String> {
}
