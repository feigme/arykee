package com.iary.tdl.dao.impl;

import org.springframework.stereotype.Component;

import com.iary.tdl.dao.UserDAO;
import com.iary.tdl.dto.UserDTO;

@Component
public class UserDAOImpl implements UserDAO {

	@Override
	public UserDTO findUserDTOByLoginName(String loginName) {
		return null;
	}

}