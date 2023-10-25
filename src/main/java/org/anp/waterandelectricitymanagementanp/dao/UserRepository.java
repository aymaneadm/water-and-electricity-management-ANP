package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.TypePolice;
import org.anp.waterandelectricitymanagementanp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    @Override
    User save(User user);
    void delete(User user);
    User findUserByidUser(String idUser);
    List<User> findAll();
}
