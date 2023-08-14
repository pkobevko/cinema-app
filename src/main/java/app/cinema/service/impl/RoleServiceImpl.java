package app.cinema.service.impl;

import app.cinema.dao.RoleDao;
import app.cinema.model.Role;
import app.cinema.service.RoleService;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(Role.RoleName.valueOf(roleName)).orElseThrow(() ->
                new NoSuchElementException("No such role with name: " + roleName));
    }
}
