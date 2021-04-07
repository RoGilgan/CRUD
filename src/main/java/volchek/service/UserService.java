package volchek.service;

import volchek.models.User;

import java.util.List;

public interface UserService {

    List<User> showAllUsers();

    User showUser(int id);

    User saveUser(User user);

    User updateUser(User updateUser);

    void deleteUser(int id);
}
