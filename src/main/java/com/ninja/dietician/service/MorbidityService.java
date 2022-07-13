package com.ninja.dietician.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja.dietician.entity.Morbidity;
import com.ninja.dietician.repository.MorbidityRepository;

@Service
public class MorbidityService {

 	@Autowired
	MorbidityRepository morbidityRepository;

	public List<Morbidity> getAllMorbidities(String infoType) {
		List<Morbidity> morbidities =  morbidityRepository.findByInfoType(infoType).get();
		return morbidities;
		/*List<Morbidity> list = new ArrayList<>();
		this.morbidityRepository.findAll().forEach(m -> {
			if (m.getMorbidityTestId() != null) {
				list.add(m);
			}
		});
		return list;*/
	}

	public List<Morbidity> getMorbidityByName(String infoType, String morbidityName) {
    	List<Morbidity> morbidities =  morbidityRepository.findByInfoTypeAndMorbidityName(infoType, morbidityName).get();
    	return morbidities;
    }
    
    public List<Morbidity> getMorbidityByTestId(String infoType, String morbidityTestId) {
    	List<Morbidity> morbidities = morbidityRepository.findByInfoTypeAndMorbidityTestId(infoType, morbidityTestId).get();
    	return morbidities;
    }
    


}
