package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.TypeClient;
import org.anp.waterandelectricitymanagementanp.models.TypeFournitureEau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeFournitureEauRepository extends JpaRepository<TypeFournitureEau,String> {
    @Override
    TypeFournitureEau save(TypeFournitureEau typeFournitureEau);
    void delete(TypeFournitureEau typeFournitureEau);
    TypeFournitureEau  findTypeFournitureEauByiid_type_fourniture_eau(String id_type_fourniture_eau);
    List<TypeFournitureEau> findAll();
}
