package com.maximalus.user;

import com.maximalus.credential.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository.
 *
 * @author Maksym Matlo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByCredential(Credential credential);
}
