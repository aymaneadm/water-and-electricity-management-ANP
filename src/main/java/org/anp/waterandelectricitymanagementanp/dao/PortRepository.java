package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Port;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortRepository extends JpaRepository<Port,String> {
    @Override
    Port save(Port port);
    void delete(Port port);
    Port  findPortByid_Port(String id_Port);
    List<Port> findAll();
}

