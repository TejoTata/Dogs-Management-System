/**
 * 
 */
package com.TataClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.TataClasses.DMS.Models.Dog;

/**
 * @author Tejo Lakshmi Tata
 *
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{
	
	List<Dog> findByName(String name);
	

}
