package com.maximalus.user;

import com.maximalus.credential.Credential;
import com.maximalus.exception.RestaurantManagerException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * UserServiceImpl.
 *
 * @author Maksym Matlo
 */
@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RestaurantManagerException(
                        String.format("User with id %d does not exist", id)));
    }

    @Override
    public User findByCredential(Credential credential) {
        return Optional.of(repository.findByCredential(credential))
                .orElseThrow(() -> new RestaurantManagerException(
                        String.format("User with credential id %d does not exist", credential.getId())));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }

    @Override
    public User deleteById(Long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RestaurantManagerException(
                        String.format("User with id %d does not exist", id)));
        user.setChangingDate(LocalDateTime.now());
        user.setDeleted(true);
        return user;
    }
}
