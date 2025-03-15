package com.roniantonius.databasepostgre.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roniantonius.databasepostgre.domain.entities.KapalEntity;

@Repository
public interface KapalRepository extends CrudRepository<KapalEntity, Long>{
	Iterable<KapalEntity> ukuranLessThan(int i);
	
	@Query("SELECT a FROM KapalEntity a WHERE a.ukuran > ?1")
	Iterable<KapalEntity> findKapalWithUkuranGreaterThan(int ukuran);
}