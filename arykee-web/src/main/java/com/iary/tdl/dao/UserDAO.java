package com.iary.tdl.dao;

import com.iary.tdl.dto.UserDTO;

public interface UserDAO {

	UserDTO findUserDTOByLoginName(String loginName);

}
