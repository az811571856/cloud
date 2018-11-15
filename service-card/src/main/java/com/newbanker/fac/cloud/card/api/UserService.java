package com.newbanker.fac.cloud.card.api;


import com.newbanker.fac.cloud.card.model.UserDTO;

/**
 */
public interface UserService {

    UserDTO findUser(Integer userId);
}
