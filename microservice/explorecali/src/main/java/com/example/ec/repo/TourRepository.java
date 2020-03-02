package com.example.ec.repo;

import com.example.ec.domain.Tour;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
	
		Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable page);

		@Override
		@RestResource(exported = false)
		default void delete(Tour arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		@RestResource(exported = false)
		default void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		@RestResource(exported = false)
		default void deleteAll(Iterable<? extends Tour> arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		@RestResource(exported = false)
		default void deleteById(Integer arg0) {
			// TODO Auto-generated method stub
			
		}


}
