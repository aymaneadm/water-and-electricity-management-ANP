package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Police;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoliceRepository extends JpaRepository<Police,String> {
    @Override
    Police save(Police police);
    void delete(Police police);
    Police  findPoliceByid_P(String id_P);
    List<Police> findAll();
}
