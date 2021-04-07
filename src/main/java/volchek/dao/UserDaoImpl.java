package volchek.dao;

import org.springframework.stereotype.Repository;
import volchek.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("SELECT p FROM User p", User.class)
                .getResultList();
    }

    @Override
    public User showUser(int id) {
        return entityManager.createQuery("SELECT u FROM User u WHERE u.id=: id", User.class)
                .setParameter("id", id).getSingleResult();
    }

    @Override
    public User saveUser(User user) {
        entityManager.persist(user);
        return user;
    }

    @Override
    public User updateUser(User updateUser) {
        entityManager.merge(updateUser);
        return updateUser;
    }

    @Override
    public void deleteUser(int id) {
        entityManager.createQuery("DELETE FROM User u WHERE u.id=: id")
                .setParameter("id", id).executeUpdate();
    }
}
