package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.User;
import org.anp.waterandelectricitymanagementanp.models.UserProfil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserProfilRepository extends JpaRepository<UserProfil,String> {
    @Override
    UserProfil save(UserProfil userProfil);
    void delete(UserProfil userProfil);
    UserProfil findUserByidUser(String idUser);
    List<UserProfil> findAll();
}
