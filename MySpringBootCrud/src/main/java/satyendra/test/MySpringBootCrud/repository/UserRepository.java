package satyendra.test.MySpringBootCrud.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import satyendra.test.MySpringBootCrud.model.User;

public interface UserRepository extends MongoRepository<User, Long>{

    Optional<User> findById(Long id);

    User findByEmailAndFname(String email, String fName);

    User save(Optional<User> use);

    void delete(Optional<User> user);
}
