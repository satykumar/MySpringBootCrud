package satyendra.test.MySpringBootCrud.services.Impl;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satyendra.test.MySpringBootCrud.model.User;
import satyendra.test.MySpringBootCrud.repository.UserRepository;
import satyendra.test.MySpringBootCrud.services.UserService;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User addUser(User user) {
        user.setFname(user.getFname());
        user.setlName(user.getlName());
        user.setEmail(user.getEmail());
        user.setIsEnable(user.getIsEnable());
        user.setIsLock(user.getIsLock());
        user.setCreatedUTC(Instant.now());
        user.setAddres(user.getAddres());
        
       return userRepository.insert(user);
    }

    @Override
    public User update(Long id, User user) {
     Optional<User> use=   userRepository.findById(id);
     if(use.isPresent())
     {
       if(user.getFname()!=null){
           use.get().setFname(user.getFname());
       }
       if(user.getlName()!=null){
           use.get().setlName(user.getlName());
       }
       if(user.getEmail()!=null){
           use.get().setEmail(user.getEmail());
       }
       if(user.getIsLock()!=null){
           use.get().setIsLock(user.getIsLock());
       }
       if(user.getIsEnable()!=null){
           use.get().setIsEnable(user.getIsEnable());
       }
       if(user.getUpdatedUTC()!=null){
           use.get().setUpdatedUTC(Instant.now());
       }
       return userRepository.save(use);
     }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
     Optional<User> user = userRepository.findById(id);
        userRepository.delete(user);
        
    }

}
