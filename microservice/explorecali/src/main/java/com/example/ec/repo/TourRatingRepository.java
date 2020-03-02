package com.example.ec.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.ec.domain.TourRating;
import com.example.ec.domain.TourRatingPk;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk> {

	/**
	 * @param tourdId
	 *            tour indentifier
	 * @return a list of tour ratings
	 */
	List<TourRating> findByPkTourId(Integer tourdId);

	/**
	 * @param tourId
	 *            tour indentifier
	 * @param costumerId
	 *            costumer indentifier
	 * @return a tour rating based tour Id and customer Id
	 */
	Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer costumerId);

}
