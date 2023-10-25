package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Releve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReleveRepository  extends JpaRepository<Releve,String> {
    @Override
    Releve save(Releve releve);
    void delete(Releve releve);
    Releve  findReleveByidR(String idR);
    List<Releve> findAll();
}
