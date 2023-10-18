package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    @Override
    Client save(Client client);
    void delete(Client client);
    Client  findOne(Long idClient);
}
