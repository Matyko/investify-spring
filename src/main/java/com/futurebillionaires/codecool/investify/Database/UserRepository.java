package com.futurebillionaires.codecool.investify.Database;

import com.futurebillionaires.codecool.investify.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByFirstName(String firstName);

    List<User> findByLastName(String lastName);

    List<User> findByEmail(String email);

    List<User> findByUsername(String username);

}
