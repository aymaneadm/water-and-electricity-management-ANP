package org.anp.waterandelectricitymanagementanp.dao;

import org.anp.waterandelectricitymanagementanp.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository  extends JpaRepository<Region,String> {
    @Override
    Region save(Region region);
    void delete(Region region);
    Region  findPortByid_Region(String id_Region);
    List<Region> findAll();
}

