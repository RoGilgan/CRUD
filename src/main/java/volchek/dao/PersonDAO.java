package volchek.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import volchek.models.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class PersonDAO {

    @PersistenceContext(unitName = "em")
    private EntityManager entityManager;

    public List<Person> index() {
        return entityManager.createQuery("SELECT p FROM Person p", Person.class)
                .getResultList();
    }

    public Person show(int id) {
//        Person person = null;
//        try {
//            PreparedStatement statement =
//                    connection.prepareStatement("SELECT * FROM person WHERE id = ?");
//            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                person = new Person();
//                person.setId(resultSet.getInt("id"));
//                person.setName(resultSet.getString("name"));
//                person.setAge(resultSet.getInt("age"));
//                person.setEmail(resultSet.getString("email"));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        return null;
    }

    @Transactional
    public void save(Person person) {

//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person (name, age, email)" +
//                    "VALUES(?, ?, ?)");
//            preparedStatement.setString(1, person.getName());
//            preparedStatement.setInt(2, person.getAge());
//            preparedStatement.setString(3, person.getEmail());
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    @Transactional
    public void update(int id, Person updatePerson) {

//        try {
//            PreparedStatement statement =
//                    connection.prepareStatement("UPDATE person SET name=?, age=?, email=? WHERE id=?");
//
//            statement.setString(1, updatePerson.getName());
//            statement.setInt(2, updatePerson.getAge());
//            statement.setString(3, updatePerson.getEmail());
//            statement.setInt(4, id);
//            statement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }

    @Transactional
    public void delete(int id) {

//        try {
//            PreparedStatement statement =
//                    connection.prepareStatement("DELETE FROM person WHERE id=?");
//            statement.setInt(1, id);
//            statement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
}
