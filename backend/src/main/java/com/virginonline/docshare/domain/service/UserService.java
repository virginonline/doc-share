package com.virginonline.docshare.domain.service;

import com.virginonline.docshare.domain.entity.user.User;
import java.util.UUID;

public interface UserService {

  User findUserById(UUID id);

  Boolean deleteUser(UUID uuid);

  User updateUser(User user);

  User createUser(User user);

  User findUserByUsername(String username);

}
