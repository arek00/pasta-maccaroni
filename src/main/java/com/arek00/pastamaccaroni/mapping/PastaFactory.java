package com.arek00.pastamaccaroni.mapping;

import com.arek00.pastamaccaroni.bo.Pasta;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author arek00 (arek00.com)
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PastaFactory {

	public static final Pasta fromJson(final PastaJson pastaJson) {
		final String tags = pastaJson.getTags()
									 .stream()
									 .reduce((tag1, tag2) -> tag1 + " " + tag2)
									 .orElse("");


		return new Pasta(pastaJson.getTitle(), pastaJson.getContent(), tags);
	}
}
