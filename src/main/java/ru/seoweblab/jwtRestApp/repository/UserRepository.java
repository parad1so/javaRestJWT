package ru.seoweblab.jwtRestApp.repository;

import ru.seoweblab.jwtRestApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface that extends {@link JpaRepository} for class {@link User}.
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
