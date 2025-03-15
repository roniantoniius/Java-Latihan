package com.roniantonius.databasepostgre.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roniantonius.databasepostgre.domain.entities.PpnEntity;

@Repository
public interface PpnRepository extends CrudRepository<PpnEntity, Long>{

	Iterable<PpnEntity> ppnYearLessThan(int i);

	@Query("SELECT a FROM PpnEntity a WHERE a.ppnYear > ?1") // artinya mengambil input dari parameter pertama
	Iterable<PpnEntity> findPpnWithYearGreaterThan(int ppnYear);

}