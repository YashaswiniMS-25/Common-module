package com.wolken.wolkenapp.Service;

import com.wolken.wolkenapp.Entity.UserEntity;

public interface UpdateService {
	public UserEntity validateAndUpdate(String email);

}
