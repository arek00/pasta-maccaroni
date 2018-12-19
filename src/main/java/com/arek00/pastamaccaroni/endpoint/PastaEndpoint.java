package com.arek00.pastamaccaroni.endpoint;

import com.arek00.pastamaccaroni.mapping.PastaJson;
import com.arek00.pastamaccaroni.service.PastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arek00 (arek00.com)
 */
@RestController
@RequestMapping("${endpoint.pasta}")
public class PastaEndpoint {

	private final PastaService service;

	@Autowired
	public PastaEndpoint(final PastaService service) {
		this.service = service;
	}

	@PostMapping("${endpoint.pasta.by_name}")
	public String getPastaByName(final String searchName) {
		return "PASTA";
	}

	@PostMapping("${endpoint.pasta.random}")
	public String getRandomPasta() {
		return "RANDOM PASTA";
	}

	@PostMapping("${endpoint.pasta.add}")
	public void addPasta(@RequestBody final PastaJson json) {
		service.savePasta(json);
	}
}
