package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Client;
import org.anp.waterandelectricitymanagementanp.models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository <Facture,String> {
        @Override
        Facture save(Facture facture);
        void delete(Facture facture);
    Facture  findFactureByIdFacture(String idFacture);
        List<Facture> findAll();
}
