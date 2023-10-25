package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,String> {
    @Override
    Client save(Client client);
    void delete(Client client);
    Client  findClientByIdClient(String idClient);
    List<Client> findAll();
}


