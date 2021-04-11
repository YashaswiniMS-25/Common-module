package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.UserDTO;
import com.wolken.wolkenapp.Entity.UserEntity;
import com.wolken.wolkenapp.Exception.User2Exception;
import com.wolken.wolkenapp.Exception.UserException;

public interface UserDAO {

public	String save(UserEntity entity) throws UserException;
public UserEntity getByEmailId(String email) throws User2Exception;

}
