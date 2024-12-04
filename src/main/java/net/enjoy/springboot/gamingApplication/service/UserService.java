package net.enjoy.springboot.gamingApplication.service;

import net.enjoy.springboot.gamingApplication.dto.UserDto;
import net.enjoy.springboot.gamingApplication.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}