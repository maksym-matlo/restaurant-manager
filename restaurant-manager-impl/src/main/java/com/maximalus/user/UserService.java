package com.maximalus.user;

import com.maximalus.credential.Credential;

import java.util.List;

/**
 * UserService.
 *
 * @author Maksym Matlo
 */
public interface UserService {
    User findById(Long id);
    User findByCredential(Credential credential);
    List<User> findAll();
    User save(User user);
    void update(User user);
    User deleteById(Long id);
}
