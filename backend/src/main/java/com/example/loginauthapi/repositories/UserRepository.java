package com.example.loginauthapi.repositories;

import com.example.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
