package com.ninja.dietician.repository;

import java.util.List;
import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.ninja.dietician.entity.Morbidity;

@EnableScan
public interface MorbidityRepository extends CrudRepository<Morbidity, String> {

	Optional<List<Morbidity>> findByInfoType(String infoType);
	
	Optional<List<Morbidity>> findByInfoTypeAndMorbidityName(String infoTpe, String morbidityName);
	
	Optional<List<Morbidity>> findByInfoTypeAndMorbidityTestId(String infoTpe, String morbidityTestId);

}
