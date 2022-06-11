package com.maximalus.credential;

import com.maximalus.exception.RestaurantManagerException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CredentialServiceImpl.
 *
 * @author Maksym Matlo
 */

@Service
@AllArgsConstructor
public class CredentialServiceImpl implements CredentialService{
    private final CredentialRepository credentialRepository;

    @Override
    public Credential save(Credential credential) {
        return credentialRepository.save(credential);
    }

    @Override
    public Credential findById(Long id) {
        return credentialRepository.findById(id)
                .orElseThrow(() -> new RestaurantManagerException(
                        String.format("Credential with %d does not exist", id)));
    }

    @Override
    public List<Credential> findAll() {
        return credentialRepository.findAll();
    }

    @Override
    public Page<Credential> findAll(Pageable pageable) {
        return credentialRepository.findAll(pageable);
    }

    @Override
    public Credential update(Credential credential) {
        return credentialRepository.save(credential);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Credential findByUsername(String username) {
        return credentialRepository.findByUsername(username)
                .orElseThrow(() ->
                        new RestaurantManagerException(
                                String.format("Credential with username %s does not exits", username)));
    }
}
