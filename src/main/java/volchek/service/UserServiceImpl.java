package volchek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import volchek.dao.UserDao;
import volchek.models.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> showAllUsers() {
        return userDao.showAllUsers();
    }

    @Override
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    public User saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User updateUser(User updateUser) {
        return userDao.updateUser(updateUser);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
