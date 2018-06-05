package satyendra.test.MySpringBootCrud.services;

import java.util.Optional;

import satyendra.test.MySpringBootCrud.model.User;

public interface UserService {

    Optional<User> getUser(Long id);

    User addUser(User user);

    User update(Long id, User user);

    void deleteUser(Long id);
}
