package ru.seoweblab.jwtRestApp.service;

import ru.seoweblab.jwtRestApp.model.User;

import java.util.List;

/**
 * Service interface for class {@link User}.
 *
 */

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
