package com.roniantonius.databasepostgre.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roniantonius.databasepostgre.domain.Kapal;

@Repository
public interface KapalRepository extends CrudRepository<Kapal, Long>{

}
