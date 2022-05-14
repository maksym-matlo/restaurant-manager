package com.maximalus.user;

import com.maximalus.openapi.v1.model.UserDto;
import com.maximalus.outlet.OutletService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserMapper.
 *
 * @author Maksym Matlo
 */
@Mapper(componentModel = "spring")
public abstract class UserMapper {
    @Autowired
    protected OutletService outletService;

    @Mappings({
            @Mapping(target = "outlet", expression = "java(outletService.findByName(userDto.getOutletName()))")
    })
    abstract User fromDto(UserDto userDto);

    @Mappings({
            @Mapping(target = "outletName", source = "user.outlet.name")
    })
    abstract UserDto toDto (User user);
}
