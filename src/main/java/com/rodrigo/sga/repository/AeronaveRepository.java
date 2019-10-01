package com.rodrigo.sga.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rodrigo.sga.model.Aeronave;

public interface AeronaveRepository extends CrudRepository<Aeronave, String>{
	
	Iterable<Object> findByCreatedAfter(Date created);
	
	Aeronave findByid(long id);
	
	Iterable<Object> findByVendido(boolean boo);
	
	@Query("select new com.rodrigo.sga.model.CountMarca(COUNT(marca) as count, marca) from Aeronave GROUP BY marca")
	Iterable<Object> findByMarca();
	
	@Query("select new com.rodrigo.sga.model.CountDecada(COUNT(ano) as count, floor((ano) / 10) * 10 as decada) from Aeronave GROUP BY col_1_0_ ORDER BY col_1_0_ desc")
	Iterable<Object> findByAno();
}
