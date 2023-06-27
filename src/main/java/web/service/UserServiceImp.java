package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoRepo;
import web.model.User;

import java.util.List;
@Service
@Transactional
public class UserServiceImp implements UserService {
    private final UserDaoRepo userDaoRepo;
    @Autowired
    public UserServiceImp(UserDaoRepo userDaoRepo) {
        this.userDaoRepo = userDaoRepo;
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> getListUsers() {
        return userDaoRepo.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public User show(Long id) {
        return userDaoRepo.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User user) {
        userDaoRepo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDaoRepo.deleteById(id);
    }

}
