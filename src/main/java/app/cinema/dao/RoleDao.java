package app.cinema.dao;

import app.cinema.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}
