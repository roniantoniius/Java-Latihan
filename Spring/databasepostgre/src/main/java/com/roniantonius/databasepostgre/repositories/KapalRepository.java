package com.roniantonius.databasepostgre.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.roniantonius.databasepostgre.domain.entities.KapalEntity;

@Repository
public interface KapalRepository extends CrudRepository<KapalEntity, Long>, PagingAndSortingRepository<KapalEntity, Long>{
}