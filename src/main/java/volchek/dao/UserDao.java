package volchek.dao;

import volchek.models.User;

import java.util.List;

public interface UserDao {

    List<User> showAllUsers();

    User showUser(int id);

    User saveUser(User user);

    User updateUser(User updateUser);

    void deleteUser(int id);
}
