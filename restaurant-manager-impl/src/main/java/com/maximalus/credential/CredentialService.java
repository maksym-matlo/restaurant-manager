package com.maximalus.credential;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * CredentialService.
 *
 * @author Maksym Matlo
 */
public interface CredentialService {
    Credential save(Credential credential);
    Credential findById(Long id);
    List<Credential> findAll();
    Page<Credential> findAll(Pageable pageable);
    Credential update(Credential credential);
    void deleteById(Long id);
    Credential findByUsername(String username);
}
