package com.example.ec.domain;

import java.io.Serializable;

import javax.persistence.*;


@Embeddable
public class TourRatingPk implements Serializable {

	@ManyToOne
	private Tour tour;
	
	@Column (insertable = false, updatable = false, nullable = false)
	private Integer customerId;
	

	public TourRatingPk(Tour tour, Integer customerId) {
		this.tour = tour;
		this.customerId = customerId;
	}

	public TourRatingPk() {}

	public Tour getTour() {
		return tour;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setTour(Tour tour) {
		this.tour = tour;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
	
	
}
