package com.mandorla.dao;

import com.mandorla.pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);
    User findByPhoneNumber(Integer phoneNumber);
}
