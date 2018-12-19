package com.arek00.pastamaccaroni.mapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author arek00 (arek00.com)
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class PastaJson {

	@JsonProperty("title") private String title;

	@JsonProperty("content") private String content;

	@JsonProperty("tags") private List<String> tags;
}
