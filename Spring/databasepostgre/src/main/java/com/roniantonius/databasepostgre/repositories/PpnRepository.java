package com.roniantonius.databasepostgre.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roniantonius.databasepostgre.domain.Ppn;

@Repository
public interface PpnRepository extends CrudRepository<Ppn, Long>{

	Iterable<Ppn> ppnYearLessThan(int i);

	@Query("SELECT a FROM Ppn a WHERE a.ppnYear > ?1") // artinya mengambil input dari parameter pertama
	Iterable<Ppn> findPpnWithYearGreaterThan(int ppnYear);

}
