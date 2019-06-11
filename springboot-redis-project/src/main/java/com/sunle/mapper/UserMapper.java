package com.sunle.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunle.entity.User;
import com.sunle.entity.UserAndRoleIdList;

public interface UserMapper {
	
	User getUserByCode1(@Param("code1") String code1);

	int addUser(User user);

	int updateUser(User user);

	int addUserRole(List<UserAndRoleIdList> userAndRoleIdList);

	List<UserAndRoleIdList> getRoleIdListByRoleCodeList(List<String> UserList);

	void delteUserRoleByCode1(@Param("code1") String code1);

}
