package com.arek00.pastamaccaroni.repository;

import com.arek00.pastamaccaroni.bo.Pasta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author arek00 (arek00.com)
 */
@Repository
public interface PastaRepository extends CrudRepository<Pasta, Long> {

	Pasta findByTitle(final String title);
}
