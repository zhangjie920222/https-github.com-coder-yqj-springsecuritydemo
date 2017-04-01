package com.study.dao;

import java.util.List;

import com.study.model.Role;
import com.study.model.URole;

public interface RoleDao {

	public List<Role> findAllRolesWithResources();

	
	public List<URole> queryRoleListWithUser(Integer id);
}