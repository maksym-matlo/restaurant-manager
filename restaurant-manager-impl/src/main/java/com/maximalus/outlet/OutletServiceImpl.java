package com.maximalus.outlet;

import com.maximalus.exception.RestaurantManagerException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * OutletServiceIml.
 *
 * @author Maksym Matlo
 */
@Service
@AllArgsConstructor
public class OutletServiceImpl implements OutletService{
    private final OutletRepository outletRepository;

    @Override
    public Outlet findByName(String name) {
        return Optional.ofNullable(outletRepository.findByName(name))
                .orElseThrow(() -> new RestaurantManagerException(
                        String.format("Outlet with name %s did not exist", name)));
    }
}
