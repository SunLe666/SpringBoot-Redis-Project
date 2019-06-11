package com.sunle.service;

import java.util.List;

import com.sunle.entity.User;
import com.sunle.entity.UserAndRoleIdList;

public interface UserService {

	String pushUserList(String code1,List<User> userList);

	User getUserByCode1(String code1);

	int addUser(User user);

	int updateUser(User user);

	int addUserRole(List<UserAndRoleIdList> userAndRoleIdList);

	List<UserAndRoleIdList> getRoleIdListByRoleCodeList(List<String> UserList);

	void delteUserRoleByCode1(String code1);
	
}
