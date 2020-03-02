package com.example.ec.domain;

import javax.persistence.*;

@Entity
public class TourRating {

	@EmbeddedId
	private TourRatingPk pk;

	@Column(nullable =false)
	private Integer score;
	
	@Column
	private String comment;

	public TourRating() {}
	
	/**
	 * @param pk
	 * @param score
	 * @param comment
	 */
	public TourRating(TourRatingPk pk, Integer score, String comment) {
		this.pk = pk;
		this.score = score;
		this.comment = comment;
	}

	public TourRatingPk getPk() {
		return pk;
	}

	public Integer getScore() {
		return score;
	}

	public String getComment() {
		return comment;
	}
	
	
}
