package com.mandorla.resource;

import com.mandorla.pojo.User;
import com.mandorla.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/all")
    public Iterable<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/load")
    public Iterable<User> persist(@RequestBody final User user){
        userRepository.save(user);
        return userRepository.findAll();
    }

}
