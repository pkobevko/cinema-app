package app.cinema.service;

import app.cinema.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
