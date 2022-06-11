package com.maximalus.outlet;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OutletRepository.
 *
 * @author Maksym Matlo
 */
public interface OutletRepository extends JpaRepository<Outlet, Long> {
    Outlet findByName(String name);
}
