package satyendra.test.MySpringBootCrud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import satyendra.test.MySpringBootCrud.model.User;
import satyendra.test.MySpringBootCrud.services.UserService;

@RequestMapping(value="/test/crud")
public class CrudController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody final User user){
        userService.addUser(user);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User UpdateUser(@PathVariable final Long id, @RequestBody final User user){
        return userService.update(id, user);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteuser(@PathVariable final Long id){
        userService.deleteUser(id);
    }
}
