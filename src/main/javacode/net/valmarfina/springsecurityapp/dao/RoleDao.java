package net.valmarfina.springsecurityapp.dao;

import net.valmarfina.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
