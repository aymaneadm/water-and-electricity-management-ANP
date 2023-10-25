package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.TypePolice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypePoliceRepository extends JpaRepository<TypePolice,String> {
    @Override
    Police save(TypePolice typePolice);
    void delete(TypePolice typePolice);
    TypePolice findPoliceByIdTypePolice(String IdTypePolice);
    List<TypePolice> findAll();
}
