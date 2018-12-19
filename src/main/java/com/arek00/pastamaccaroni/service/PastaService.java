package com.arek00.pastamaccaroni.service;

import com.arek00.pastamaccaroni.bo.Pasta;
import com.arek00.pastamaccaroni.mapping.PastaFactory;
import com.arek00.pastamaccaroni.mapping.PastaJson;
import com.arek00.pastamaccaroni.repository.PastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author arek00 (arek00.com)
 */
@Service
public class PastaService {

	private final PastaRepository repository;

	@Autowired
	public PastaService(final PastaRepository repository) {
		this.repository = repository;
	}

	public Pasta getPastaByTitle(final String name) {
		return repository.findByTitle(name);
	}

	public void savePasta(final PastaJson json) {
		repository.save(PastaFactory.fromJson(json));
	}
}
