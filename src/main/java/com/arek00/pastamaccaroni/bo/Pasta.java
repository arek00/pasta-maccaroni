package com.arek00.pastamaccaroni.bo;

import javax.persistence.*;

/**
 * @author arek00 (arek00.com)
 */

@Entity
@Table(name = "pastas")
public class Pasta {

	public Pasta(final String title, final String content, final String tags) {
		this.title = title;
		this.content = content;
		this.tags = tags;
	}

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "pastas_id_seq")
	@SequenceGenerator(name = "pastas_id_seq", sequenceName = "pastas_id_seq", allocationSize = 1)
	private Long id;

	private String title;

	private String content;

	private String tags;

}
