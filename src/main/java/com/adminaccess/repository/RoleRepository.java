package com.adminaccess.repository;

import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/7/21.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
