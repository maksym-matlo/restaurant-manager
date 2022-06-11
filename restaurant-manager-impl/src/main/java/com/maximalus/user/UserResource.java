package com.maximalus.user;

import com.maximalus.openapi.v1.api.UsersV1Api;
import com.maximalus.openapi.v1.model.PageView;
import com.maximalus.openapi.v1.model.RequestFilter;
import com.maximalus.openapi.v1.model.CommonResponseDto;
import com.maximalus.openapi.v1.model.UserDto;
import com.maximalus.util.PageViewService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * UserResource.
 *
 * @author Maksym Matlo
 */
@RestController
@AllArgsConstructor
public class UserResource implements UsersV1Api {
    private final UserService userService;
    private final UserMapper userMapper;
    private final PageViewService<UserDto> resourceService;

    @Override
    public ResponseEntity<UserDto> getUserById(Long userId) {
        User user = userService.findById(userId);
        UserDto responseBody = userMapper.toDto(user);
        return ResponseEntity.ok(responseBody);
    }

    @Override
    public ResponseEntity<PageView<UserDto>> getUserList(Pageable pageable, RequestFilter filter) {
        List<User> users = userService.findAll();
        List<UserDto> responseBody = users.stream().map(userMapper::toDto).collect(Collectors.toList());
        PageView<UserDto> view = resourceService.createPageView(responseBody);
        return ResponseEntity.ok(view);
    }

    @Override
    public ResponseEntity<CommonResponseDto> postUser(UserDto userDto) {
        User user = userMapper.fromDto(userDto);
        User savedUser = userService.save(user);
        Long userId = savedUser.getId();
        return ResponseEntity.ok(new CommonResponseDto().responseId(userId));
    }

    @Override
    public ResponseEntity<CommonResponseDto> updateUser(Long userId, UserDto userDto) {
        if(userService.findById(userId) != null){
            User user = userMapper.fromDto(userDto);
            userService.update(user);
            return ResponseEntity.ok(new CommonResponseDto().responseId(userId));
        }
        return ResponseEntity.ok(null);
    }

    @Override
    public ResponseEntity<UserDto> deleteUser(Long userId) {
        User user = userService.deleteById(userId);
        UserDto responseBody = userMapper.toDto(user);
        return ResponseEntity.ok(responseBody);
    }
}
