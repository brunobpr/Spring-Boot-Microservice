package com.example.ec.repo;

import com.example.ec.domain.TourPackage;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
	
	/**
	 * @param name name of the package
	 * @return TourPakage
	 */
	Optional<TourPackage> findByName(@Param("name") String name);

	@Override
	@RestResource(exported = false)
	default void delete(TourPackage arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported = false)
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported = false)
	default void deleteAll(Iterable<? extends TourPackage> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported = false)
	default void deleteById(String arg0) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	@RestResource(exported = false)
	default <S extends TourPackage> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	@RestResource(exported = false)
	default <S extends TourPackage> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

